package com.example.media_player;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PixelFormat;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mp,vmp;
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        videoView = (VideoView) findViewById(R.id.videoview);
        videoView.setVisibility(View.INVISIBLE);
        mp =MediaPlayer.create(this,R.raw.song);



    }
    public void start(View v)
    {
        mp.start();
        Toast.makeText(this, "START SONG", Toast.LENGTH_SHORT).show();
    }
    public void stop(View v)
    {
        mp.stop();
        Toast.makeText(this, "STOP", Toast.LENGTH_SHORT).show();
    }
    public void pause(View v){
        mp.pause();
        Toast.makeText(this, "PAUSE", Toast.LENGTH_SHORT).show();
    }
    public void vstart(View v)
    {
        videoView.setVisibility(View.VISIBLE);
        getWindow().setFormat(PixelFormat.UNKNOWN);
        String  uripath = "android.resource://com.example.media_player/"+R.raw.video;

        Uri uri =Uri.parse(uripath);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();
    }


    
}
