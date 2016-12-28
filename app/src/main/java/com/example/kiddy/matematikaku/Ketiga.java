package com.example.kiddy.matematikaku;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

public class Ketiga extends AppCompatActivity {

    TextView hasil;
    EditText x0,x1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ketiga);

        x0 = (EditText) findViewById(R.id.et_x0);
        x1 = (EditText) findViewById(R.id.et_x1);
        Button hitung = (Button) findViewById(R.id.button);
        Button hapus = (Button) findViewById(R.id.buttonclear);
        hasil = (TextView) findViewById(R.id.hasil);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(x0.getText().toString().trim().length() == 0){
                    Toast.makeText(Ketiga.this, "x0 atau x1 tidak boleh kosong !", Toast.LENGTH_SHORT).show();
                }
                else if(x1.getText().toString().trim().length() == 0) {
                    Toast.makeText(Ketiga.this, "x0 atau x1 tidak boleh kosong !", Toast.LENGTH_SHORT).show();
                }
                else if(x0.getText().toString().trim().length() != 0)
                {
                    sekan();
                }


            }
        });

        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hapus();
            }
        });


    }

    public void hapus(){
        hasil.setText("");
        x0.setText("");
        x1.setText("");
    }

    public void sekan(){
        hasil.setText("");

        x0 = (EditText) findViewById(R.id.et_x0);
        x1 = (EditText) findViewById(R.id.et_x1);

        double a = Double.parseDouble(x0.getText().toString());
        double b = Double.parseDouble(x1.getText().toString());
        double fa;
        double fb;
        double c;
        double lebar=3;

        boolean berhenti = false;

        double epsilon1 = 0.000001; //toleransi galat akar hampiran
        double epsilon2 = 0.000000001; //toleransi nilai yang hampir 0
        int Nmaks = 30; //jumlah maksimum lebaran


        for(int i=0; i < Nmaks; i++)
        {

            //x3 + 2x2 + 15x - 5
            fa = (Math.E * (Math.pow(a,3))) - 12;
            fb = (Math.E * (Math.pow(b,3))) - 12;

            c=b-(fb*(b-a)/(fb-fa));

            lebar = c-a;
            a = b;
            b = c;
            if(fa == fb)
            {
                hasil.append("Iterasi ke " + (i - 1) + " telah mendekati nilai 0");
                break;
            }

            //mencetak hasil pencarian akar
            //System.out.println("Iterasi ke- " +i+ "\nNilai tengah : " +c +"\nlebar :"+lebar +"\nGalat:"+fb + "\n");

            //String nilai = String.valueOf(c);
            hasil.append("Iterasi ke " + i + " = " + c + "\n\n");
        }


    }
}
