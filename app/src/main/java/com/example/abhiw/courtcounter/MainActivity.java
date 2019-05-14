package com.example.abhiw.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA=0;
    int scoreB=0;
    int a3=0;
    int a2=0;
    int a=0;
    int b3=0;
    int b2=0;
    int b=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plus3a(View view) {
        scoreA=scoreA+3;
        a3++;
        display3A(a3);
        displayA(scoreA);
    }
    public void plus2a(View view) {
        scoreA=scoreA+2;
        a2++;
        display2A(a2);
        displayA(scoreA);
    }
    public void plus1a(View view) {
        scoreA=scoreA+1;
        a++;
        display1A(a);
        displayA(scoreA);
    }

    public void resetA(View view) {
        scoreA=0;
        resetstatsA();
        displayA(scoreA);
    }


    public void resetB(View view) {
        scoreB=0;
        resetstatsB();
        displayB(scoreB);
    }

    public void plus1b(View view) {
        scoreB=scoreB+1;
        b++;
        display1B(b);
        displayB(scoreB);
    }

    public void plus2b(View view) {
        scoreB=scoreB+2;
        b2++;
        display2B(b2);
        displayB(scoreB);
    }

    public void plus3b(View view) {
        scoreB=scoreB+1;
        b3++;
        display3B(b3);
        displayB(scoreB);
    }
    private void resetstatsA(){
        a=0;
        a2=0;
        a3=0;
        display1A(0);
        display2A(0);
        display3A(0);
    }
    private void resetstatsB(){
        b=0;
        b2=0;
        b3=0;
        display1B(0);
        display2B(0);
        display3B(0);
    }

    private void display1A(int a) {
        TextView scoreView = (TextView) findViewById(R.id.count1a);
        scoreView.setText(String.valueOf(a));
    }
    private void display2A(int a2) {
        TextView scoreView = (TextView) findViewById(R.id.count2a);
        scoreView.setText(String.valueOf(a2));
    }
    private void display3A(int a3) {
        TextView scoreView = (TextView) findViewById(R.id.count3a);
        scoreView.setText(String.valueOf(a3));
    }

    private void display3B(int b3) {
        TextView scoreView = (TextView) findViewById(R.id.count3b);
        scoreView.setText(String.valueOf(b3));
    }
    private void display2B(int b2) {
        TextView scoreView = (TextView) findViewById(R.id.count2b);
        scoreView.setText(String.valueOf(b2));
    }
    private void display1B(int b) {
        TextView scoreView = (TextView) findViewById(R.id.count1b);
        scoreView.setText(String.valueOf(b));
    }

    private void displayB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.skorB);
        scoreView.setText(String.valueOf(scoreB));
    }
    private void displayA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.skorA);
        scoreView.setText(String.valueOf(scoreA));
    }


}
