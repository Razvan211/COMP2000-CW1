package com.example.comp2000_cw1_nicarazvan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Leaderboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leaderboard);

        Button Back=(Button) findViewById(R.id.BackLBID);

        Back.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Game1.class);
            startActivity(intent);
        });
    }
}