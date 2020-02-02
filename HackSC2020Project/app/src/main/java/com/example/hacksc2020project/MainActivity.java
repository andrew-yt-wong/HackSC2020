package com.example.hacksc2020project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

// Main Page
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Takes you to the login page when the button is clicked
    public void login(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    // Takes you to the create account page when the button is clicked
    public void createAccount(View view){
        Intent intent = new Intent(this, CreateActivity.class);
        startActivity(intent);
    }
}
