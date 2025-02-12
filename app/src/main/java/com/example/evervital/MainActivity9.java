package com.example.evervital;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main9);

        View backic = findViewById(R.id.imageView25);
        backic.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity9.this, MainActivity8.class);
            startActivity(intent);
        });

        View hm = findViewById(R.id.imageView34);
        hm.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity9.this, MainActivity4.class);
            startActivity(intent);
        });

        View al = findViewById(R.id.imageView35);
        al.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity9.this, MainActivity7.class);
            startActivity(intent);
        });

        View pr = findViewById(R.id.imageView36);
        pr.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity9.this, MainActivity8.class);
            startActivity(intent);
        });
    }
}