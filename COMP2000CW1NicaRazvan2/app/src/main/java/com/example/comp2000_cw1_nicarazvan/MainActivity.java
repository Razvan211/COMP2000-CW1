package com.example.comp2000_cw1_nicarazvan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText Username= (EditText) findViewById(R.id.EmailID);
        EditText Password= (EditText) findViewById(R.id.PasswordID);

        Button logBtn= (Button) findViewById(R.id.LogInBtn);

        //username : admin,  password: admin

        logBtn.setOnClickListener(v -> {
            if(Username.getText().toString().equals("admin") && Password.getText().toString().equals("admin")){
                //go to next page
                Intent intent = new Intent(getApplicationContext(), Menu1.class);
                startActivity(intent);

            }else
                //incorrect
                Toast.makeText(MainActivity.this,"LogIn Failed",Toast.LENGTH_SHORT).show();
        });



    }
}