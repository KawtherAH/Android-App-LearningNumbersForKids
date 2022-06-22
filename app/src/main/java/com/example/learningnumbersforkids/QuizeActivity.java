package com.example.learningnumbersforkids;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class QuizeActivity extends AppCompatActivity implements View.OnClickListener {

    Button q1_btn1, q1_btn2, q1_btn3;
    Button q2_btn1, q2_btn2, q2_btn3;
    Button q3_btn1, q3_btn2, q3_btn3;
    Button q4_btn1, q4_btn2, q4_btn3;
    Button q5_btn1, q5_btn2, q5_btn3;
    Button q6_btn1, q6_btn2, q6_btn3;
    Button q7_btn1, q7_btn2, q7_btn3;
    Button q8_btn1, q8_btn2, q8_btn3;
    Button q9_btn1, q9_btn2, q9_btn3;
    Button q10_btn1, q10_btn2, q10_btn3;
    Button q11_btn1, q11_btn2, q11_btn3;

    public int Result = 0;
    int Q1_Result = 0, Q2_Result = 0, Q3_Result = 0, Q4_Result = 0, Q5_Result = 0,
            Q6_Result = 0, Q7_Result = 0, Q8_Result = 0, Q9_Result = 0, Q10_Result = 0, Q11_Result = 0;
    private String TAG = "Sound";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quize);

        NavBar();

        // Q1
        q1_btn1 = findViewById(R.id.Q1_btn1);
        q1_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q1_btn1.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        q1_btn2 = findViewById(R.id.Q1_btn2);
        q1_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q1_btn2.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        q1_btn3 = findViewById(R.id.Q1_btn3);
        q1_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Q1_Result = 1;
                Correct();
                q1_btn3.setBackgroundColor(getResources().getColor(R.color.LightGreen));
            }
        });
        //Q2
        q2_btn1 = findViewById(R.id.Q2_btn1);
        q2_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Q2_Result = 1;
                Correct();
                q2_btn1.setBackgroundColor(getResources().getColor(R.color.LightGreen));
            }
        });
        q2_btn2 = findViewById(R.id.Q2_btn2);
        q2_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q2_btn2.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        q2_btn3 = findViewById(R.id.Q2_btn3);
        q2_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q2_btn3.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        //Q3
        q3_btn1 = findViewById(R.id.Q3_btn1);
        q3_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q3_btn1.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        q3_btn2 = findViewById(R.id.Q3_btn2);
        q3_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q3_btn2.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        q3_btn3 = findViewById(R.id.Q3_btn3);
        q3_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Q3_Result = 1;
                Correct();
                q3_btn3.setBackgroundColor(getResources().getColor(R.color.LightGreen));
            }
        });
        //Q4
        q4_btn1 = findViewById(R.id.Q4_btn1);
        q4_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q4_btn1.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        q4_btn2 = findViewById(R.id.Q4_btn2);
        q4_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Q4_Result = 1;
                Correct();
                q4_btn2.setBackgroundColor(getResources().getColor(R.color.LightGreen));
            }
        });
        q4_btn3 = findViewById(R.id.Q4_btn3);
        q4_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q4_btn3.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        //Q5
        q5_btn1 = findViewById(R.id.Q5_btn1);
        q5_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q5_btn1.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        q5_btn2 = findViewById(R.id.Q5_btn2);
        q5_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q5_btn2.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        q5_btn3 = findViewById(R.id.Q5_btn3);
        q5_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Q5_Result = 1;
                Correct();
                q5_btn3.setBackgroundColor(getResources().getColor(R.color.LightGreen));
            }
        });
        //Q6
        q6_btn1 = findViewById(R.id.Q6_btn1);
        q6_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q6_btn1.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        q6_btn2 = findViewById(R.id.Q6_btn2);
        q6_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Q6_Result = 1;
                Correct();
                q6_btn2.setBackgroundColor(getResources().getColor(R.color.LightGreen));
            }
        });
        q6_btn3 = findViewById(R.id.Q6_btn3);
        q6_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q6_btn3.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        //Q7
        q7_btn1 = findViewById(R.id.Q7_btn1);
        q7_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q7_btn1.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        q7_btn2 = findViewById(R.id.Q7_btn2);
        q7_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q7_btn2.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        q7_btn3 = findViewById(R.id.Q7_btn3);
        q7_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Q7_Result = 1;
                Correct();
                q7_btn3.setBackgroundColor(getResources().getColor(R.color.LightGreen));
            }
        });
        //Q8
        q8_btn1 = findViewById(R.id.Q8_btn1);
        q8_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q8_btn1.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        q8_btn2 = findViewById(R.id.Q8_btn2);
        q8_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q8_btn2.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        q8_btn3 = findViewById(R.id.Q8_btn3);
        q8_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Q8_Result = 1;
                Correct();
                q8_btn3.setBackgroundColor(getResources().getColor(R.color.LightGreen));
            }
        });
        //Q9
        q9_btn1 = findViewById(R.id.Q9_btn1);
        q9_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q9_btn1.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        q9_btn2 = findViewById(R.id.Q9_btn2);
        q9_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q9_btn2.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        q9_btn3 = findViewById(R.id.Q9_btn3);
        q9_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Q9_Result = 1;
                Correct();
                q9_btn3.setBackgroundColor(getResources().getColor(R.color.LightGreen));
            }
        });
        //Q10
        q10_btn1 = findViewById(R.id.Q10_btn1);
        q10_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Q10_Result = 1;
                Correct();
                q10_btn1.setBackgroundColor(getResources().getColor(R.color.LightGreen));
            }
        });
        q10_btn2 = findViewById(R.id.Q10_btn2);
        q10_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q10_btn2.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        q10_btn3 = findViewById(R.id.Q10_btn3);
        q10_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q10_btn3.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });

        //Q11
        q11_btn1 = findViewById(R.id.Q11_btn1);
        q11_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q11_btn1.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });
        q11_btn2 = findViewById(R.id.Q11_btn2);
        q11_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Q11_Result = 1;
                Correct();
                q11_btn2.setBackgroundColor(getResources().getColor(R.color.LightGreen));
            }
        });
        q11_btn3 = findViewById(R.id.Q11_btn3);
        q11_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Incorrect();
                q11_btn3.setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });

        final MediaPlayer mp = MediaPlayer.create(this, R.raw.nine);
        ImageButton play_button = findViewById(R.id.imageButton);
        play_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.v(TAG, "Playing sound...");
                mp.start();
            }
        });

        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.one);
        ImageButton play_button1 = findViewById(R.id.imageButton1);
        play_button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.v(TAG, "Playing sound...");
                mp1.start();
            }
        });

        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.three);
        ImageButton play_button2 = findViewById(R.id.imageButton2);
        play_button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.v(TAG, "Playing sound...");
                mp2.start();
            }
        });

        TextView seeResult = findViewById(R.id.seeResult);
        Button ResultBtn = findViewById(R.id.Result);
        seeResult.setOnClickListener(this);
        ResultBtn.setOnClickListener(this);
    }
    public void Correct() {
        MediaPlayer.create(this, R.raw.correct).start();
    }
    public void Incorrect() {
        MediaPlayer.create(this, R.raw.incorrect).start();
    }


    @Override
    public void onClick(View view) {
        // send Result to Result Activity
        Result = Q1_Result + Q2_Result + Q3_Result + Q4_Result + Q5_Result + Q6_Result + Q7_Result + Q8_Result
                + Q9_Result + Q10_Result + Q11_Result;
        Intent i = new Intent(QuizeActivity.this,ResultActivity.class);
        i.putExtra("result", String.valueOf(Result));
        startActivity(i);

    }

    public void NavBar(){
        BottomNavigationView bottomNav = findViewById(R.id.BottmBar);
        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.HomePg:
                        startActivity(new Intent(QuizeActivity.this, MainActivity.class));
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        break;
                    case R.id.QuizePg:
                        startActivity(new Intent(QuizeActivity.this, QuizeActivity.class));
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        break;
                    case R.id.ResultPg:
                        startActivity(new Intent(QuizeActivity.this, ResultActivity.class));
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        break;
                }
                return false;
            }
        });
    }
}