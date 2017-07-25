package com.lehoczky.petra.android.musicalstructureapp;

import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.lehoczky.petra.android.musicalstructureapp.MainActivity;
import com.lehoczky.petra.android.musicalstructureapp.NowPlayingActivity;

import java.util.ArrayList;

public class LibraryActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ArrayAdapter<String> trackAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        // fill the list with playlists
        ListView listTracks = (ListView) findViewById(R.id.list_playlists);
        ArrayList<String> tracks = new ArrayList<String>();
        tracks.add("Búza, búza, búza...");
        tracks.add("Csillagok, csillagok...");
        tracks.add("Hej Dunáról...");
        tracks.add("Tavaszi szél...");
        tracks.add("Által mennék ln a Tiszán...");
        tracks.add("Lipem lopom a szőlőt...");
        tracks.add("A csitári hegyek alatt...");

        trackAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tracks);
        listTracks.setAdapter(trackAdapter);
        listTracks.setOnItemClickListener(this);

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView now = (ImageView) findViewById(R.id.now_playing);
        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowIntent = new Intent(LibraryActivity.this, NowPlayingActivity.class);
                startActivity(nowIntent);
            }
        });

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView home = (ImageView) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeIntent = new Intent(LibraryActivity.this, MainActivity.class);
                startActivity(homeIntent);
            }
        });
    }

    /**
     * a playlist is clicked, start the playback of the tracks it includes
     */
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String selectedTrack = trackAdapter.getItem(position);
        Intent startPlayer = new Intent(this, NowPlayingActivity.class);
        startPlayer.putExtra("track", selectedTrack);
        startActivity(startPlayer);
    }
}
