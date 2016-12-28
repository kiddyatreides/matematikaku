package com.example.kiddy.matematikaku;

/**
 * Created by Kiddy on 12/18/2016.
 */
public class HitungSekan {
    public void HitungSekan(){
        double a=0.1;
        double b=0.2;
        double fa;
        double fb;
        double c;
        double lebar=3;

        for(int i=0; i<600; i++)
        {
            fa=Math.pow(Math.E,a)-5*Math.pow(a,2);
            fb=Math.pow(Math.E,b)-5*Math.pow(b,2);

            c=b-(fb*(b-a)/(fb-fa));

            lebar=c-a;
            a=b;
            b=c;
            if(fa==fb)
            {
                break;
            }

            //mencetak hasil pencarian akar
            System.out.println("Iterasi ke- " +i+ "\nNilai tengah : " +c +"\nlebar :"+lebar +"\nGalat:"+fb + "\n");
        }
    }

}
