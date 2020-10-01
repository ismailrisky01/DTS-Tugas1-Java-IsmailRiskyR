package com.example.dts_tugas1_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeBack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_back);
    }
    public void clickForgot(View view){
        Intent i = new Intent(WelcomeBack.this, ForgotPassword.class);
        startActivity(i);
    }
    public void postLogin(View view){
        Intent i = new Intent(WelcomeBack.this, SuccessActivity.class);
        startActivity(i);
    }
}