package com.example.dumisile.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MusicSolution extends AppCompatActivity {
    private TextView txtresult;
    String myscore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_solution);
        txtresult= (TextView) findViewById(R.id.txtresults);

        final Intent intent = getIntent();
        //  String name= intent.getStringExtra(movies.MYNAME);
        int score = intent.getIntExtra(myscore, Music.MYSCORRE);

        if (score>= 6) {
            txtresult.setText("CONGRATULATIONS "+ " YOUR SCORE IS:" + score);


        } else {
            txtresult.setText("NICE TRY "+" YOUR SCORE IS: " + score);
        }
    }
}
