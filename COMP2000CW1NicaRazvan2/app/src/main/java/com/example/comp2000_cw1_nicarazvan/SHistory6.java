package com.example.comp2000_cw1_nicarazvan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SHistory6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shistory6);

        Button Back=(Button) findViewById(R.id.BackSHistory6ID);
        Back.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Game6.class);
            startActivity(intent);
        });
    }
}