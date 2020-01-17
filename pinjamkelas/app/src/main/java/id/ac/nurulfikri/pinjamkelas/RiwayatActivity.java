package id.ac.nurulfikri.pinjamkelas;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class RiwayatActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    PinjamService service;
    //ArrayList<Waktu> data;
    ArrayAdapter<RiwayatAdapter> adapter;
    //private RecyclerView.Adapter adapter;
    private ProgressDialog progress;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);

        progress = new ProgressDialog(this);
        progress.setCancelable(false);
        progress.setMessage("Loading ...");
        progress.show();

        final ImageView menuHome = findViewById(R.id.menuHome);
        menuHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        RiwayatActivity.this,
                        HomepageActivity.class
                );
                startActivity(i);
            }
        });

        final ImageView menuPinjam = findViewById(R.id.menuPeminjaman);
        menuPinjam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        RiwayatActivity.this,
                        PeminjamanActivity.class
                );
                startActivity(i);
            }
        });

        /*
        final ImageView menuGrafik = findViewById(R.id.menuGrafik);
        menuGrafik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        RiwayatActivity.this,
                        GrafikPinjamActivity.class
                );
                startActivity(i);
            }
        });

         */

        final ImageView menuRiwayat = findViewById(R.id.menuRiwayat);
        menuRiwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        RiwayatActivity.this,
                        RiwayatActivity.class
                );
                startActivity(i);
            }
        });


        ArrayList<Riwayat> data = new ArrayList<>();
        recyclerView = findViewById((R.id.riwayatView));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RiwayatActivity.this);
        recyclerView.setLayoutManager(layoutManager);

        final RiwayatAdapter adapter = new RiwayatAdapter(data);
        recyclerView.setAdapter(adapter);


        service = ApiClient.getClient().create(PinjamService.class);
        Call<List<Riwayat>> riwayatCall = service.getRiwayat();
        riwayatCall.enqueue(new Callback<List<Riwayat>>() {
            @Override
            public void onResponse(Call<List<Riwayat>> call, Response<List<Riwayat>> response) {
                List<Riwayat> riwayatList = (List<Riwayat>) response.body();
                Log.i("MYLOG","DATA DARI SERVER:"+response.body());
                RiwayatAdapter adapter = new RiwayatAdapter(riwayatList);
                recyclerView.setAdapter(adapter);
                progress.dismiss();
            }

            @Override
            public void onFailure(Call<List<Riwayat>> call, Throwable t) {
                Log.i("Error","DATA DARI SERVER:" + t.getMessage());
                Toast.makeText(RiwayatActivity.this,"Gagal Ambil data",Toast.LENGTH_LONG).show();
            }
        });
    }
}
