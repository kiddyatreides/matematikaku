package com.example.kiddy.matematikaku;

import android.content.Intent;
import android.media.Image;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        ImageView secant = (ImageView) findViewById(R.id.btn_secant2);
        ImageView about =(ImageView) findViewById(R.id.btn_about);

        secant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cv = new Intent(Home.this, Menumtk.class);
                startActivity(cv);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hai = new Intent(Home.this, About.class);
                startActivity(hai);
            }
        });
    }
}
