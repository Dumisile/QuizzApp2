package com.example.dumisile.quizzapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import static android.R.attr.name;
import static android.R.attr.password;
import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;
import static android.provider.Telephony.Carriers.PASSWORD;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    static EditText editName, editPassword;
    ImageButton imgMovie, imgMusic;
    public static String username;

    public static final String NAME="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = (EditText) findViewById(R.id.editName);
        editPassword = (EditText) findViewById(R.id.editPassword);
        imgMovie = (ImageButton) findViewById(R.id.imgMovie);
        imgMusic = (ImageButton) findViewById(R.id.imgMusic);

        imgMusic.setOnClickListener(this);
        imgMovie.setOnClickListener(this);
            }

    //    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.imgMovie) {


            AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
            dialog.setTitle("MOVIE QUIZZ INSTRUCTIONS");
            dialog.setMessage("<Each question in th Quizz is of multiple-choice format..." + "" +
                    "<Read each question carefully and click on the right radio button...>" + "" +
                    "<Each correct response will result in 1 point for your score...>" + "" +
                    "<After responding to all the questions click on the score button to get your results...>" + "" +
                    "YOU MAY START YOUR QUIZZ GOOD LUCK...!!!");


            dialog.setPositiveButton("START QUIZZ", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Intent intent = new Intent(MainActivity.this, movies.class);
                    intent.putExtra(NAME, username);
                    startActivity(intent);

//                    Intent intent1 = new Intent(MainActivity.this, movies.class);
//                    startActivity(intent1);
                }
            });

            dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.dismiss();
                }
            });
            dialog.show();


        }

        if (v.getId()==R.id.imgMusic){
            AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
            dialog.setTitle("MOVIE QUIZZ INSTRUCTIONS");
            dialog.setMessage("<Each question in th Quizz is of multiple-choice format..." + "" +
                    "<Read each question carefully and click on the right radio button...>" + "" +
                    "<Each correct response will result in 1 point for your score...>" + "" +
                    "<After responding to all the questions click on the score button to get your results...>" + "" +
                    "YOU MAY START YOUR QUIZZ GOOD LUCK...!!!");


            dialog.setPositiveButton("START QUIZZ", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    Intent intent1 = new Intent(MainActivity.this, Music.class);
                   startActivity(intent1);

               //     username= editName.getText().toString();

//                    Intent intent = new Intent(MainActivity.this, Music.class);
  //                  intent.putExtra(NAME, username);
    //                startActivity(intent);

                }
            });

            dialog.setNegativeButton("CANCEL", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    dialog.dismiss();
                }
            });
            dialog.show();


        }


    }
}

