package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    private Button move ;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
//        move= findViewById(R.id.loginbtn);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView username = findViewById(R.id.username);
        TextView password = findViewById(R.id.password);

        MaterialButton login = (MaterialButton) findViewById(R.id.loginbtn);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (username.getText().toString().equals("Chhole")&&password.getText().toString().equals("Bhature")){
                    Toast.makeText(MainActivity.this, "UserBanner" , Toast.LENGTH_SHORT).show();
                }
                else{
                    Intent intent = new Intent(MainActivity.this,SecondPage.class);
                    startActivity(intent);

                }
            }
        });

    }
}