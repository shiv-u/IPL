package com.androidexample.ipl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class secondscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondscreen);
    }
    public void toss(View view)
    {
        Intent to=new Intent(this,tossactivity.class);
        startActivity(to);
    }
}
