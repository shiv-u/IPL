package com.androidexample.ipl;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;


public class tossactivity extends AppCompatActivity {

    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tossactivity);


        String videopath="android.resource://com.androidexample.ipl/"+R.raw.rcb;
        videoView= findViewById(R.id.videoview);
        MediaController mediaController=new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        Uri uri=Uri.parse(videopath);
        videoView.setVideoURI(uri);
        videoView.requestFocus();
        videoView.start();


    }
    public void rcb(View view)
    {
        Intent intent=new Intent(this,rcbbatting.class);
        startActivity(intent);
    }



}
