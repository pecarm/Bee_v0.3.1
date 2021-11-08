package com.example.bee_v03;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ObjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_object);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}