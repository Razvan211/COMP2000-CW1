package com.example.comp2000_cw1_nicarazvan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class Menu1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        Button Game1= (Button) findViewById(R.id.Game1ID);

        Button LogOut= (Button) findViewById(R.id.LogOutID);

        Button Next = (Button) findViewById(R.id.NextID);

        Button Game2= (Button) findViewById(R.id.Game2ID);

        Button Game3= (Button) findViewById(R.id.Game3ID);

        Game1.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Game1.class);
            startActivity(intent);
        });

        LogOut.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        });
        Next.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Menu2.class);
            startActivity(intent);
        });

        Game2.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Game2.class);
            startActivity(intent);
        });

        Game3.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), Game3.class);
            startActivity(intent);
        });
    }
}