package com.androidexample.ipl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class rcbbatting extends AppCompatActivity {
   public int rcb_score=0,wickets=0;
    int over=0;
    int balls=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rcbbatting);
    }
    public int getRcb_score()
    {
        return rcb_score;
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
    }
    public void sixruns(View view)
    {
        rcb_score += 6;
        displayscore(rcb_score);
        displayovers();

    }
    public void fourruns(View view)
    {

        rcb_score+=4;
        displayscore(rcb_score);
        displayovers();
    }
    public void tworun(View view)
    {
        rcb_score+=2;
        displayscore(rcb_score);
        displayovers();
    }
    public void onerun(View view)
    {
        rcb_score+=1;
        displayscore(rcb_score);
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
    public void csk(View view)
    {
        Intent intent=new Intent(this,csk.class);
        intent.putExtra("arg",rcb_score);
        startActivity(intent);
    }

}
