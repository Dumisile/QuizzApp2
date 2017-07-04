package com.example.dumisile.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static android.os.Build.VERSION_CODES.M;
import static com.example.dumisile.quizzapp.R.drawable.music;
import static com.example.dumisile.quizzapp.movies.MYNAME;
import static com.example.dumisile.quizzapp.movies.MYSCORE;

public class Music extends AppCompatActivity implements View.OnClickListener {

    public RadioGroup groupOne, groupTwo, groupThree, groupFour, groupFive, groupSix, groupSeven, groupEight, groupNine, groupTen;
    public Button btnSubmit;
    static RadioButton rad1;
    static RadioButton rad2;
    static RadioButton radC;
    static RadioButton radD;
    static RadioButton radE;
    static RadioButton radF;
    static RadioButton radG;
    static RadioButton radH;
    static RadioButton radI;
    static RadioButton radJ;
    String name2;
    int Score = 0;
    public final static String SCORRE ="";
    public static int MYSCORRE = 0;
   // public static String MYNAAME;
    private String intresults;



    //musicJ objMusic = new musicJ();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        rad1=(RadioButton)findViewById(R.id.rad1);
        rad2=(RadioButton)findViewById(R.id.rad2);
        radC=(RadioButton)findViewById(R.id.radC);
        radD=(RadioButton)findViewById(R.id.radD);
        radE=(RadioButton)findViewById(R.id.radE);
        radF=(RadioButton)findViewById(R.id.radF);
        radG=(RadioButton)findViewById(R.id.radG);
        radH=(RadioButton)findViewById(R.id.radH);
        radI=(RadioButton)findViewById(R.id.radI);
        radJ=(RadioButton)findViewById(R.id.radJ);
        groupOne = (RadioGroup) findViewById(R.id.groupOne);
        groupTwo = (RadioGroup) findViewById(R.id.groupTwo);
        groupThree = (RadioGroup) findViewById(R.id.groupThree);
        groupFour = (RadioGroup) findViewById(R.id.groupFour);
        groupFive = (RadioGroup) findViewById(R.id.groupFive);
        groupSix = (RadioGroup) findViewById(R.id.groupSix);
        groupSeven = (RadioGroup) findViewById(R.id.groupSeven);
        groupEight = (RadioGroup) findViewById(R.id.groupEight);
        groupNine = (RadioGroup) findViewById(R.id.groupNine);
        groupTen = (RadioGroup) findViewById(R.id.groupTen);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnSubmit) {
            int Group1Id = groupOne.getCheckedRadioButtonId();
            if (Group1Id == R.id.rad1) {
                Score = Score + 1;
            }
            int Group2Id = groupTwo.getCheckedRadioButtonId();
            if (Group2Id == R.id.rad2) {
                Score = Score + 1;
            }
            int Group3Id = groupThree.getCheckedRadioButtonId();
            if (Group3Id == R.id.radC) {
                Score = Score + 1;
            }
            int Group4Id = groupFour.getCheckedRadioButtonId();
            if (Group4Id == R.id.radD) {
                Score = Score + 1;
            }
            int Group5Id = groupFive.getCheckedRadioButtonId();
             if (Group5Id == R.id.radE){
                Score = Score + 1;
            }
            int Group6Id = groupSix.getCheckedRadioButtonId();
                if (Group6Id == R.id.radF){
                Score = Score + 1;
            }
            int Group7Id = groupSeven.getCheckedRadioButtonId();
                if (Group7Id == R.id.radG) {
                Score = Score + 1;
            }
            int Group8Id = groupEight.getCheckedRadioButtonId();
                if (Group8Id == R.id.radH){
                Score = Score + 1;
            }
                int Group9Id = groupNine.getCheckedRadioButtonId();
                if (Group9Id == R.id.radI){
                Score = Score + 1;
            }
                int Group10Id = groupTen.getCheckedRadioButtonId();
                if (Group10Id == R.id.radJ){
                Score = Score + 1;
            }
            //Intent intent = getIntent();
            //name2= intent.getStringExtra(MainActivity.NAME);


            }
        MYSCORRE = Score;
        //MYNAME = MainActivity.NAME;

        Intent intent = getIntent();
        intent.putExtra(String.valueOf(MYSCORRE),Score);
        //intent.putExtra(MYNAME, MainActivity.NAME);
        Intent intent2 =new Intent(Music.this, MusicSolution.class);
        startActivity(intent2);
        Score=0;

    }
    }
