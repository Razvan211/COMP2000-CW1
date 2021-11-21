package com.example.comp2000_cw1_nicarazvan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SHistory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shistory);

        Button Back=(Button) findViewById(R.id.BackSHistoryID);
        Back.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Game1.class);
            startActivity(intent);
        });
    }
}