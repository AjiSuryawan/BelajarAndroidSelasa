package com.example.belajarandroidselasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MenuUtama extends AppCompatActivity {

    ImageButton ivsgd;
    ImageButton ivusd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_utama);
        ivsgd = (ImageButton) findViewById(R.id.ivsgd);
        ivusd = (ImageButton) findViewById(R.id.ivusd);

        ivsgd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}