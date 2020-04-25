package com.example.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Smile extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smile);
        TextView textView = findViewById(R.id.name);

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String name = extras.get("name");
            textView.setText(name);
        }

        Button close = findViewById(
    }
}
