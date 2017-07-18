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
                Intent nepdalokIntent = new Intent(MainActivity.this, com.lehoczky.petra.android.musicalstructureapp.NepdalokActivity.class);
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
                Intent poprockIntent = new Intent(MainActivity.this, com.lehoczky.petra.android.musicalstructureapp.PoprockActivity.class);
                startActivity(poprockIntent);
            }
        });

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView list = (ImageView) findViewById(R.id.list);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(MainActivity.this, com.lehoczky.petra.android.musicalstructureapp.LibraryActivity.class);
                startActivity(listIntent);
            }
        });

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView now = (ImageView) findViewById(R.id.nowPlaying);
        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowIntent = new Intent(MainActivity.this, com.lehoczky.petra.android.musicalstructureapp.NowPlayingActivity.class);
                startActivity(nowIntent);
            }
        });
    }
}
