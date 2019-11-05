package id.ac.nurulfikri.pinjamkelas;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class RiwayatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.riwayat);

        final ImageView imgHome = findViewById(R.id.imgHome);
        imgHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                    RiwayatActivity.this,
                    HomepageActivity.class
                );
                startActivity(i);
            }
        });

        final ImageView imgPinjam = findViewById(R.id.imgPinjam);
        imgPinjam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        RiwayatActivity.this,
                        PeminjamanActivity.class
                );
                startActivity(i);
            }
        });

        final ImageView imgGrafik = findViewById(R.id.imgGrafik);
        imgGrafik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        RiwayatActivity.this,
                        GrafikPinjamActivity.class
                );
                startActivity(i);
            }
        });

        final ImageView imgRiwayat = findViewById(R.id.imgRiwayat);
        imgRiwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        RiwayatActivity.this,
                        RiwayatActivity.class
                );
                startActivity(i);
            }
        });
    }
}
