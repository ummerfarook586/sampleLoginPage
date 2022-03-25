package com.example.sampleloginapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {
    Button btnLogin;
    TextInputEditText etUsername, etpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLogin = findViewById(R.id.btnLogin);
        etUsername = findViewById(R.id.etUsername);
        etpassword = findViewById(R.id.etpassword);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isValidation()) {
                    startActivity(new Intent(MainActivity.this, HomeActivity.class).putExtra("UserName", etUsername.getEditableText().toString()));

                }
            }
        });

    }

    private boolean isValidation() {
        if (etUsername.getEditableText().toString().length() == 0) {
            etUsername.setError("Enter Username");
            return false;
        } else if (etpassword.getEditableText().toString().length() == 0) {
            etpassword.setError("Enter Password");
            return false;
        }
        return true;
    }
}