package id.ac.nurulfikri.pinjamkelas;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Button;

public class HomepageActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);


        /*final ImageView menuGrafik = findViewById(R.id.imgGrafik);
        //inner class
        menuGrafik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                    HomepageActivity.this,
                    GrafikPinjamActivity.class
                );
                startActivity(i);
            }
        });
         */

        final ImageView menuPeminjaman = findViewById(R.id.imgPeminjaman);

        menuPeminjaman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        HomepageActivity.this,
                        PeminjamanActivity.class
                );
                startActivity(i);
            }
        });

        /*
        final ImageView menuSignout = findViewById(R.id.imgSignout);

        menuSignout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        HomepageActivity.this,
                        MainActivity.class
                );
                startActivity(i);
            }
        });
         */

        final ImageView menuRiwayat = findViewById(R.id.imgRiwayat);
        menuRiwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(
                        HomepageActivity.this,
                        RiwayatActivity.class
                );
                startActivity(i);
            }
        });

    }
}
