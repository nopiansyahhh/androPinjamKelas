package id.ac.nurulfikri.pinjamkelas;

import androidx.appcompat.app.AppCompatActivity;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PinjamActivity extends AppCompatActivity {
    EditText mahasiswa_id,tanggal,ket, ruangan_id;
    TextView ruangan, hari, jadwal;
    Button btnInsert;
    PinjamService mPinjamService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pinjam);

        final ImageView menuHome = findViewById(R.id.menuHome);
        menuHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        PinjamActivity.this,
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
                        PinjamActivity.this,
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
                        PinjamActivity.this,
                        RiwayatActivity.class
                );
                startActivity(i);
            }
        });

        ruangan = (TextView) findViewById(R.id.ruangan);
        hari = (TextView) findViewById(R.id.hari);
        jadwal = (TextView) findViewById(R.id.jadwal);
        ruangan_id = (EditText) findViewById(R.id.ruangan_id);
        tanggal = (EditText) findViewById(R.id.tanggal);
        ket = (EditText) findViewById(R.id.ket);
        mahasiswa_id = (EditText) findViewById(R.id.mahasiswa_id);
        //detAlasan = (EditText) findViewById(R.id.detAlasan);

        Intent mIntent = getIntent();
        ruangan.setText("Ruaangan : " + mIntent.getStringExtra("gedung") + " . " + mIntent.getStringExtra("ruangan"));
        hari.setText("Hari : " + mIntent.getStringExtra("hari"));
        jadwal.setText("Jadwal : " + mIntent.getStringExtra("jamawal") +" - "+ mIntent.getStringExtra("jamakhir"));
        ruangan_id.setText("" + mIntent.getStringExtra("ruangan_id"));

        mPinjamService = ApiClient.getClient().create(PinjamService.class);
        btnInsert = (Button) findViewById(R.id.btn_Insert);
        btnInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Call<CreatePeminjaman> createPeminjamanCall = mPinjamService.postPeminjaman(
                        mahasiswa_id.getText().toString(),
                        ruangan_id.getText().toString(),
                        ket.getText().toString(),
                        tanggal.getText().toString());
                createPeminjamanCall.enqueue(new Callback<CreatePeminjaman>() {
                    @Override
                    public void onResponse(Call<CreatePeminjaman> call, Response<CreatePeminjaman> response) {
                        //String message = response.body().getMessage();
                        Log.i("MYLOG","DATA DARI SERVER: berhasil disimpan"+response.body());

                        Toast.makeText(PinjamActivity.this,"berhasil disimpan",Toast.LENGTH_LONG).show();
                        Intent i = new Intent(
                                PinjamActivity.this,
                                NotifActivity.class
                        );
                        startActivity(i);

                    }

                    @Override
                    public void onFailure(Call<CreatePeminjaman> call, Throwable t) {
                        //String message = response.body().getMessage();
                        Log.i("[ERROR LOG]","GAGAL SIMPAN"+t.getMessage());
                        Toast.makeText(PinjamActivity.this,"Gagal Simpan",Toast.LENGTH_LONG).show();

                    }
                });
            }
        });
    }
}
