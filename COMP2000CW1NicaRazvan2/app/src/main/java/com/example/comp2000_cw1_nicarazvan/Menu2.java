package com.example.comp2000_cw1_nicarazvan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Menu2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        Button Back=(Button) findViewById(R.id.BackID);

        Button Game4= (Button) findViewById(R.id.Game4ID);

        Button Game5= (Button) findViewById(R.id.Game5ID);

        Button Game6= (Button) findViewById(R.id.Game6ID);

        Game4.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Game4.class);
            startActivity(intent);
        });


        Game5.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Game5.class);
            startActivity(intent);
        });

        Game6.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Game6.class);
            startActivity(intent);
        });

        Back.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Menu1.class);
            startActivity(intent);
        });
    }
}