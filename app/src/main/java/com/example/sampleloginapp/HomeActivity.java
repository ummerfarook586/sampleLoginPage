package com.example.sampleloginapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    String UserName;
    TextView tvWelcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        tvWelcome = findViewById(R.id.tvWelcome);

        UserName = getIntent().getStringExtra("UserName");
        tvWelcome.setText("Welcome " + UserName);

    }
}