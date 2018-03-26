package com.androidexample.ipl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class csk extends AppCompatActivity {
   int cskscore=0,wickets=0;
   int rcbscore;
   int over=0;
   int balls=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csk2);
        rcbscore = getIntent().getExtras().getInt("arg");
        Log.i("Csk","RCB"+rcbscore);


    }
    public void displayovers()
    {
        TextView overs=findViewById(R.id.cskovers);
        if(over!=5 && wickets!=10) {
            balls += 1;
            if (balls > 6) {
                balls = 0;
                over += 1;
                overs.setText("" + over + "." + balls);
            } else
                overs.setText("" + over + "." + balls);
        }


    }

    public void displayscore(int score)
    {
        if(over!=5 && wickets!=10) {
            TextView batting = findViewById(R.id.cskscore);
            batting.setText("" + score + "/ ");
        }
        Log.i("Csk","Csk"+cskscore);
    }
    public void sixruns(View view)
    {
            cskscore += 6;
            displayscore(cskscore);
            displayovers();

    }
    public void fourruns(View view)
    {

        cskscore+=4;
        displayscore(cskscore);
        displayovers();
    }
    public void tworun(View view)
    {
        cskscore+=2;
        displayscore(cskscore);
        displayovers();
    }
//    public int getCskscore()
//    {
//        return cskscore;
//    }
    public void onerun(View view)
    {
        cskscore+=1;
        displayscore(cskscore);
        displayovers();
    }
    public void displaywickets(int wicket)
    {
        TextView wickets=findViewById(R.id.cskwickets);
        wickets.setText(""+wicket);
    }
    public void wicket(View view)
    {
        if(wickets<10 && over!=5) {
            wickets += 1;
            displaywickets(wickets);
            displayovers();
        }
    }
    public void matchresults(View view)
    {

        if(rcbscore>cskscore) {
            Intent intent = new Intent(this, rcbwin.class);
            startActivity(intent);
        }
        else
        {
            Intent intent = new Intent(this,cskwin.class);
            startActivity(intent);
        }
    }

}
