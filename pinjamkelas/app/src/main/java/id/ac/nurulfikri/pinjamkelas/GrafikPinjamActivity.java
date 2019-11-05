package id.ac.nurulfikri.pinjamkelas;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class GrafikPinjamActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grafik_pinjam);

        final ImageView menuHome = findViewById(R.id.menuHome);
        menuHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        GrafikPinjamActivity.this,
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
                        GrafikPinjamActivity.this,
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
                        GrafikPinjamActivity.this,
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
                        GrafikPinjamActivity.this,
                        RiwayatActivity.class
                );
                startActivity(i);
            }
        });
    }


}
