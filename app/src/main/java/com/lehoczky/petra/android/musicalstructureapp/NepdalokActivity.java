package com.lehoczky.petra.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class NepdalokActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nepdalok);

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView list = (ImageView) findViewById(R.id.list);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(NepdalokActivity.this, com.lehoczky.petra.android.musicalstructureapp.LibraryActivity.class);
                startActivity(listIntent);
            }
        });

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView now = (ImageView) findViewById(R.id.now_playing);
        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowIntent = new Intent(NepdalokActivity.this, com.lehoczky.petra.android.musicalstructureapp.NowPlayingActivity.class);
                startActivity(nowIntent);
            }
        });
    }
}

