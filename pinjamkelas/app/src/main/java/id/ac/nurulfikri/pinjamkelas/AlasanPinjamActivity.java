package id.ac.nurulfikri.pinjamkelas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AlasanPinjamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alasan_pinjam);

        final ImageView menuHome = findViewById(R.id.menuHome);
        menuHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        AlasanPinjamActivity.this,
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
                        AlasanPinjamActivity.this,
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
                        AlasanPinjamActivity.this,
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
                        AlasanPinjamActivity.this,
                        RiwayatActivity.class
                );
                startActivity(i);
            }
        });

        final Button tblAjukan = findViewById(R.id.tbl_ajukan);
        tblAjukan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        AlasanPinjamActivity.this,
                        PengajuanBerhasilActivity.class
                );
                startActivity(i);
            }
        });

        final ImageView imgBack = findViewById(R.id.imgBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        AlasanPinjamActivity.this,
                        PeminjamanActivity.class
                );
                startActivity(i);
            }
        });
    }
}
