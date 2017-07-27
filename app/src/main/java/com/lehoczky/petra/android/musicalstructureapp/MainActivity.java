package com.lehoczky.petra.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView nepdalok = (ImageView) findViewById(R.id.nepdalok);
        nepdalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nepdalokIntent = new Intent(MainActivity.this, NepdalokActivity.class);
                startActivity(nepdalokIntent);
            }
        });

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView gyerekdalok = (ImageView) findViewById(R.id.gyerekdalok);
        gyerekdalok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gyerekdalokIntent = new Intent(MainActivity.this, GyerekdalokActivity.class);
                startActivity(gyerekdalokIntent);
            }
        });

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView poprock = (ImageView) findViewById(R.id.poprock);
        poprock.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent poprockIntent = new Intent(MainActivity.this, PoprockActivity.class);
                startActivity(poprockIntent);
            }
        });

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView playlist = (ImageView) findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, LibraryActivity.class);
                startActivity(playlistIntent);
            }
        });

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView now_playing = (ImageView) findViewById(R.id.now_playing);
        now_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent now_playingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(now_playingIntent);
            }
        });

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView now_buying = (ImageView) findViewById(R.id.now_buying);
        now_buying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent now_buyingIntent = new Intent(MainActivity.this, PaymentActivity.class);
                startActivity(now_buyingIntent);
            }
        });
    }
}
