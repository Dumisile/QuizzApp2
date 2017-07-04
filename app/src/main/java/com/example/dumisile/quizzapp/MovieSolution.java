package com.example.dumisile.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.name;
import static android.R.attr.x;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.os.Build.VERSION_CODES.M;
import static com.example.dumisile.quizzapp.R.id.groupA;
import static com.example.dumisile.quizzapp.R.id.groupB;
import static com.example.dumisile.quizzapp.R.id.groupC;
import static com.example.dumisile.quizzapp.R.id.groupD;
import static com.example.dumisile.quizzapp.R.id.groupE;
import static com.example.dumisile.quizzapp.R.id.groupF;
import static com.example.dumisile.quizzapp.R.id.groupG;
import static com.example.dumisile.quizzapp.R.id.groupH;
import static com.example.dumisile.quizzapp.R.id.groupI;
import static com.example.dumisile.quizzapp.R.id.groupJ;

public class MovieSolution extends AppCompatActivity {
    private TextView txtResult;
    String myScore;
    //MainActivity myName = new MainActivity();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_solution);

        txtResult= (TextView) findViewById(R.id.txtResults);

        final Intent intent = getIntent();
      //  String name= intent.getStringExtra(movies.MYNAME);
        int score = intent.getIntExtra(myScore, movies.MYSCORE);

            if (score>= 6) {
              txtResult.setText("CONGRATULATIONS "+ " YOUR SCORE IS:" + score);


            } else {
                txtResult.setText("NICE TRY "+" YOUR SCORE IS: " + score);
            }



    }
}
