package com.example.learningnumbersforkids;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        NavBar();

        Intent intentMsg = getIntent();
        String result = intentMsg.getStringExtra("result");

        if(result != null) {
            int reImg = Integer.parseInt(result);
            ImageView img = findViewById(R.id.ResultImg);
            TextView t = findViewById(R.id.ResultText);

            img.requestLayout();
            img.getLayoutParams().height = 500;
            img.getLayoutParams().width = 500;
            img.setScaleType(ImageView.ScaleType.FIT_CENTER);

            if (reImg > 0 && reImg < 4) {
                MediaPlayer.create(this, R.raw.slow_sad).start();
                img.setImageResource(R.drawable.medal3rd);
                t.setTextColor(getColor(R.color.Red));
                t.setText(result + "/10"+"\nKeep Going 😊");
            } else if (reImg > 3 && reImg < 9) {
                MediaPlayer.create(this, R.raw.completion_level).start();
                img.setImageResource(R.drawable.medal2nd);
                t.setTextColor(getColor(R.color.LightOrange));
                t.setText(result + "/10"+"\nKeep Going 🤩");
            } else if (reImg == 10) {
                MediaPlayer.create(this, R.raw.completion_level).start();
                img.setImageResource(R.drawable.medal1st);
                t.setTextColor(getColor(R.color.LightGreen));
                t.setText(result + "/10"+"\nGood Job 🎉");
            }else if (reImg == 11) {
                MediaPlayer.create(this, R.raw.bonus_extra).start();
                img.setImageResource(R.drawable.winner);
                t.setTextColor(getColor(R.color.DarkGreen));
                t.setText(result + "/10"+"\nGreet Job 🎉🏆");
            }
            t.setTypeface(Typeface.DEFAULT_BOLD);
            t.setTextSize(35);
        }
    }
    public void NavBar(){
        BottomNavigationView bottomNav = findViewById(R.id.BottmBar);
        bottomNav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.HomePg:
                        startActivity(new Intent(ResultActivity.this, MainActivity.class));
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        break;
                    case R.id.QuizePg:
                        startActivity(new Intent(ResultActivity.this, QuizeActivity.class));
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        break;
                    case R.id.ResultPg:
                        startActivity(new Intent(ResultActivity.this, ResultActivity.class));
                        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                        break;
                }
                return false;
            }
        });
    }

}