package com.example.dumisile.quizzapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.security.PublicKey;

import static android.os.Build.VERSION_CODES.M;
import static com.example.dumisile.quizzapp.R.id.btnSubmit;
import static com.example.dumisile.quizzapp.R.id.groupFive;
import static com.example.dumisile.quizzapp.R.id.groupFour;
import static com.example.dumisile.quizzapp.R.id.groupOne;
import static com.example.dumisile.quizzapp.R.id.groupSeven;
import static com.example.dumisile.quizzapp.R.id.groupSix;
import static com.example.dumisile.quizzapp.R.id.groupThree;
import static com.example.dumisile.quizzapp.R.id.groupTwo;

public class movies extends AppCompatActivity implements View.OnClickListener {

    public RadioGroup groupA, groupB, groupC, groupD, groupE, groupF, groupG, groupH, groupI, groupJ;
    public Button btnsubmit;
    static RadioButton radA;
    static RadioButton radB;
    static RadioButton rad3;
    static RadioButton rad4;
    static RadioButton rad5;
    static RadioButton rad6;
    static RadioButton rad7;
    static RadioButton rad8;
    static RadioButton rad9;
    static RadioButton rad10;

    public final static String SCORE ="";
    public static int MYSCORE = 0;
    public static String MYNAME;
    private String intResults;
    int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movies);

        radA=(RadioButton)findViewById(R.id.radA);
        radB=(RadioButton)findViewById(R.id.radB);
        rad3=(RadioButton)findViewById(R.id.rad3);
        rad4=(RadioButton)findViewById(R.id.rad4);
        rad5=(RadioButton)findViewById(R.id.rad5);
        rad6=(RadioButton)findViewById(R.id.rad6);
        rad7=(RadioButton)findViewById(R.id.rad7);
        rad8=(RadioButton)findViewById(R.id.rad8);
        rad9=(RadioButton)findViewById(R.id.rad9);
        rad10=(RadioButton)findViewById(R.id.rad10);
        groupA = (RadioGroup) findViewById(R.id.groupA);
        groupB = (RadioGroup) findViewById(R.id.groupB);
        groupC = (RadioGroup) findViewById(R.id.groupC);
        groupD = (RadioGroup) findViewById(R.id.groupD);
        groupE = (RadioGroup) findViewById(R.id.groupE);
        groupF = (RadioGroup) findViewById(R.id.groupF);
        groupG = (RadioGroup) findViewById(R.id.groupG);
        groupH = (RadioGroup) findViewById(R.id.groupH);
        groupI = (RadioGroup) findViewById(R.id.groupI);
        groupJ = (RadioGroup) findViewById(R.id.groupJ);
        btnsubmit = (Button) findViewById(R.id.btnsubmit);

        btnsubmit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {





        if (v.getId() == R.id.btnsubmit) {
            int GroupAId = groupA.getCheckedRadioButtonId();
            if (GroupAId == R.id.radA) {
                score = score + 1;
            }

            int GroupBId = groupB.getCheckedRadioButtonId();
            if (GroupBId == R.id.radB) {
                score = score + 1;
            }
            int GroupCId = groupC.getCheckedRadioButtonId();
            if (GroupCId == R.id.rad3) {
                score = score + 1;
            }
            int GroupDId = groupD.getCheckedRadioButtonId();
            if (GroupDId == R.id.rad4){
                score = score + 1;
            }
            int GroupEId = groupE.getCheckedRadioButtonId();
            if (GroupEId == R.id.rad5)
            {
                score = score + 1;
            }

            int GroupFId = groupF.getCheckedRadioButtonId();
            if (GroupFId == R.id.rad6)
            {
                score = score + 1;
            }

            int GroupGId = groupG.getCheckedRadioButtonId();
            if (GroupGId == R.id.rad7) {
                score = score + 1;
            }
            int GroupHId = groupH.getCheckedRadioButtonId();
            if (GroupHId == R.id.rad8)
            {
                score = score + 1;
            }

            int GroupIId = groupI.getCheckedRadioButtonId();
            if (GroupIId == R.id.rad9) {

                score = score + 1;
            }
            int GroupJId = groupJ.getCheckedRadioButtonId();
            if (GroupJId == R.id.rad10) {
                score = score + 1;
            }

//            if (score >= 6) {
//                //Toast.makeText(movies.this, "CONGRATULATIONS "+name +" YOUR SCORE IS:" + score, Toast.LENGTH_LONG).show();
//                Toast.makeText(getApplicationContext(),"Your Score"+name+score,Toast.LENGTH_LONG).show();
//
//            } else {
//                Toast.makeText(movies.this, "NICE TRY " +name+" YOUR SCORE IS: " + score, Toast.LENGTH_LONG).show();
//            }
           // intResults = String.valueOf(score);
            MYSCORE = score;
            MYNAME = MainActivity.NAME;

            Intent intent = getIntent();
            intent.putExtra(String.valueOf(MYSCORE),score);
               intent.putExtra(MYNAME, MainActivity.NAME);
            Intent intent2 =new Intent(movies.this, MovieSolution.class);
            startActivity(intent2);
            score=0;


        }

    }
}