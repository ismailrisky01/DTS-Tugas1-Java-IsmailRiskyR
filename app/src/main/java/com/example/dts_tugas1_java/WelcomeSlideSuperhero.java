package com.example.dts_tugas1_java;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeSlideSuperhero extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_slide_superhero);
    }
    public void clickGetStarted(View view){
        Intent i = new Intent(WelcomeSlideSuperhero.this, SlideAssign.class);
        startActivity(i);
    }
    public void clickLogin(View view){
        Intent i = new Intent(WelcomeSlideSuperhero.this, WelcomeBack.class);
        startActivity(i);
    }
}