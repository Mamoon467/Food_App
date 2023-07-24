package com.example.foodapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button Login,Register;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Login=findViewById(R.id.btnLogin);
        Register=findViewById(R.id.btnRegister);
        Register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Register has been Clicked", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,SignUp_Activity.class);
                startActivity(intent);
            }
        });
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Login Has been Clicked", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,SignIn_Acitivity.class);
                startActivity(intent);
            }
        });
    }
}