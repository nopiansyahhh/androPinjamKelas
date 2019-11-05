package id.ac.nurulfikri.pinjamkelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class PeminjamanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_peminjaman);

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

        final Button tblStatusPinjam = findViewById(R.id.button2);
        tblStatusPinjam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        PeminjamanActivity.this,
                        AlasanPinjamActivity.class
                );
                startActivity(i);
            }
        });
    }
}
