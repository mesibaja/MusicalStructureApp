package com.lehoczky.petra.android.musicalstructureapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;

import com.lehoczky.petra.android.musicalstructureapp.LibraryActivity;
import com.lehoczky.petra.android.musicalstructureapp.MainActivity;


public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView home = (ImageView) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowIntent = new Intent(NowPlayingActivity.this, MainActivity.class);
                startActivity(nowIntent);
            }
        });

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView list = (ImageView) findViewById(R.id.list);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(NowPlayingActivity.this, LibraryActivity.class);
                startActivity(homeIntent);
            }
        });
    }
}
