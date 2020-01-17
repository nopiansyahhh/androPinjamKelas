package id.ac.nurulfikri.pinjamkelas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class NotifActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notif_berhasil);

        final ImageView menuHome = findViewById(R.id.menuHome);
        menuHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        NotifActivity.this,
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
                        NotifActivity.this,
                        PeminjamanActivity.class
                );
                startActivity(i);
            }
        });
        final ImageView menuRiwayat = findViewById(R.id.menuRiwayat);
        menuRiwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        NotifActivity.this,
                        RiwayatActivity.class
                );
                startActivity(i);
            }
        });
    }
}
