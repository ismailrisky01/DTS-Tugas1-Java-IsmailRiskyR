package com.example.dts_tugas1_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SlideAssign extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_assign);
    }

    public void clickGetStarted(View view){
        Intent i = new Intent(SlideAssign.this, WelcomeBack.class);
        startActivity(i);
    }
    public void clickLogin(View view){
        Intent i = new Intent(SlideAssign.this, WelcomeBack.class);
        startActivity(i);
    }
}