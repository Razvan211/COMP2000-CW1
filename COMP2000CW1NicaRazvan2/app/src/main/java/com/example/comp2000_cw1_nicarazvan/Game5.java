package com.example.comp2000_cw1_nicarazvan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Game5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game5);

        Button Back = (Button) findViewById(R.id.Back5ID);

        Button Leaderboard = (Button) findViewById(R.id.LeaderboardID);

        Button sHistory = (Button) findViewById(R.id.sHistoryID);

        Leaderboard.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Leaderboard5.class);
            startActivity(intent);
        });
        sHistory.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), SHistory5.class);
            startActivity(intent);
        });
        Back.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Menu2.class);
            startActivity(intent);
        });
    }
    }
