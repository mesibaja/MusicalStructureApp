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
        ImageView playlist = (ImageView) findViewById(R.id.playlist);
        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(NepdalokActivity.this, LibraryActivity.class);
                startActivity(playlistIntent);
            }
        });

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView now_playing = (ImageView) findViewById(R.id.now_playing);
        now_playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent now_playingIntent = new Intent(NepdalokActivity.this, NowPlayingActivity.class);
                startActivity(now_playingIntent);
            }
        });
    }
}

