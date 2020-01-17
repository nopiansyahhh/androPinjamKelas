package id.ac.nurulfikri.pinjamkelas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PeminjamanActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    PinjamService service;
    //ArrayList<Waktu> data;
    ArrayAdapter<WaktuAdapter> adapter;
    private ProgressDialog progress;
    //private RecyclerView.Adapter adapter;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peminjaman);

        progress = new ProgressDialog(this);
        progress.setCancelable(false);
        progress.setMessage("Loading ...");
        progress.show();

        final ImageView menuHome = findViewById(R.id.menuHome);
        menuHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        PeminjamanActivity.this,
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
                        PeminjamanActivity.this,
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
                        PeminjamanActivity.this,
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
                        PeminjamanActivity.this,
                        RiwayatActivity.class
                );
                startActivity(i);
            }
        });


        /*
        // listview
        data = new ArrayList<Waktu>();
        list_pinjam = findViewById(R.id.listView);
        adapter = new ArrayAdapter<Waktu>(this, android.R.layout.simple_list_item_1,data);
        list_pinjam.setAdapter(adapter);

        service = ApiClient.getClient().create(PinjamService.class);
        Call<List<Waktu>> call = service.getWaktu();
        call.enqueue(new Callback<List<Waktu>>() {
            @Override
            public void onResponse(Call<List<Waktu>> call, Response<List<Waktu>> response) {
                Log.i("Log", "Data dari server"+response.body());
                data =(List<Waktu>) response.body();
                adapter.addAll(data);
                adapter.notifyDataSetChanged();

            }

            @Override
            public void onFailure(Call<List<Waktu>> call, Throwable t) {
                Toast.makeText(PeminjamanActivity.this,"Gagal Ambil data",Toast.LENGTH_LONG).show();
            }
        });
    } //kalau yang bawah mau di uncomment, hapus kurawal ini

         */

        ArrayList<Waktu> data = new ArrayList<>();
        recyclerView = findViewById((R.id.recyclerLayout));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(PeminjamanActivity.this);
        recyclerView.setLayoutManager(layoutManager);

        final WaktuAdapter adapter = new WaktuAdapter(data);
        recyclerView.setAdapter(adapter);


        service = ApiClient.getClient().create(PinjamService.class);
        Call<List<Waktu>> waktuCall = service.getWaktu();
        waktuCall.enqueue(new Callback<List<Waktu>>() {
            @Override
            public void onResponse(Call<List<Waktu>> call, Response<List<Waktu>> response) {
                List<Waktu> waktuList = (List<Waktu>) response.body();
                Log.i("MYLOG","DATA DARI SERVER:"+response.body());
                WaktuAdapter adapter = new WaktuAdapter(waktuList);
                recyclerView.setAdapter(adapter);
                progress.dismiss();
            }

            @Override
            public void onFailure(Call<List<Waktu>> call, Throwable t) {
                Log.i("Error","DATA DARI SERVER:" + t.getMessage());
                Toast.makeText(PeminjamanActivity.this,"Gagal Ambil data",Toast.LENGTH_LONG).show();
            }
        });
    }
        /*
        ((retrofit2.Call) waktuCall).enqueue(new Callback<GetWaktu>() {
            @Override
            public void onResponse(Call call, Response response) {
                //List<Waktu> waktuList = response.body().getWaktuList();
                //Log.d("Get","jumlah data:"+ String.valueOf(waktuList.size()));
                //final WaktuAdapter adapter = new WaktuAdapter(waktuList);
                //recyclerView.setAdapter(adapter);
                List<Waktu> waktuList = (List<Waktu>) response.body();
                Log.i("MYLOG","DATA DARI SERVER:"+response.body());
                WaktuAdapter adapter = new WaktuAdapter(waktuList);
                recyclerView.setAdapter(adapter);
                //final WaktuAdapter adapter = new WaktuAdapter(waktuList);
                //recyclerView.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                Log.i("Error","DATA DARI SERVER:" + t.getMessage());
                Toast.makeText(RecyclerActivity.this,"Gagal Ambil data",Toast.LENGTH_LONG).show();
            }
        });

         */

        /*
        Call<GetWaktu> waktuCall = mPinjamService.getWaktu();
        waktuCall.enqueue(new Callback<GetWaktu>() {
            @Override
            public void onResponse(Call<GetWaktu> call, Response<GetWaktu> response) {
                List<Waktu> waktuList = response.body().getWaktuList();
                Log.d("Get","jumlah data:"+ String.valueOf(waktuList.size()));
                mAdapter = new WaktuAdapter(waktuList);
                mRecyclerView.setAdapter(mAdapter);
                mAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<GetWaktu> call, Throwable t) {
                Log.i("MYLOG","DATA DARI SERVER:" + t.getMessage());
                Toast.makeText(PeminjamanActivity.this,"Gagal Ambil data",Toast.LENGTH_LONG).show();
            }
        });

         */

    /*
    public void refresh(){
        Call<GetWaktu> waktuCall = mPinjamService.getWaktu();
        waktuCall.enqueue(new Callback<GetWaktu>() {
            @Override
            public void onResponse(Call<GetWaktu> call, Response<GetWaktu> response) {
                List<Waktu> waktuList = response.body().getWaktuList();
                Log.d("Get","jumlah data:"+ String.valueOf(waktuList.size()));
                mAdapter = new WaktuAdapter(waktuList);
                mRecyclerView.setAdapter(mAdapter);
            }

            @Override
            public void onFailure(Call<GetWaktu> call, Throwable t) {
                Toast.makeText(PeminjamanActivity.this,"Gagal Ambil data",Toast.LENGTH_LONG).show();
            }
        });
    }

     */




        /*
        ArrayList<Waktu> data = new ArrayList<>();

        data.add(new Waktu("09:00","10:00"));
        data.add(new Waktu("09:00","10:00"));
        data.add(new Waktu("09:00","10:00"));
        data.add(new Waktu("09:00","10:00"));
        data.add(new Waktu("09:00","10:00"));
        data.add(new Waktu("09:00","10:00"));
        data.add(new Waktu("09:00","10:00"));
        data.add(new Waktu("09:00","10:00"));



        recyclerView = findViewById((R.id.list_waktu));
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(PeminjamanActivity.this);
        recyclerView.setLayoutManager(layoutManager);

        WaktuAdapter adapter = new WaktuAdapter((ArrayList<Waktu>) data);
        recyclerView.setAdapter(adapter);
        */

        /*
        setContentView(R.layout.activity_peminjaman);

        progressDialog = new ProgressDialog(PeminjamanActivity.this);
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        PinjamService service = ApiClient.getRetrofitInstance().create(PinjamService.class);
        Call<List<Waktu>> call = service.getAllWaktu();
        call.enqueue(new Callback<List<Waktu>>() {
            @Override
            public void onResponse(Call<List<Waktu>> call, Response<List<Waktu>> response) {
                progressDialog.dismiss();
                generateWaktulist(response.body());
            }

            @Override
            public void onFailure(Call<List<Waktu>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(PeminjamanActivity.this,"Data Gak ketemu",Toast.LENGTH_SHORT).show();
            }
        });

    }

    public void generateWaktulist(List<Waktu> waktuList){
        recyclerView = findViewById(R.id.list_waktu);
        adapter = new WaktuAdapter(this, waktuList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(PeminjamanActivity.this);
        //LinearLayoutManager layoutManager = new LinearLayoutManager(PeminjamanActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

         */
}
