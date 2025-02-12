package com.example.evervital;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main7);

        ImageView backicn = findViewById(R.id.imageView22);
        backicn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity7.this, MainActivity4.class);
            startActivity(intent);
        });

        ImageView homee = findViewById(R.id.imageView23);
        homee.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity7.this, MainActivity4.class);
            startActivity(intent);
        });

        ImageView addto = findViewById(R.id.imageView24);
        addto.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity7.this, MainActivity7.class);
            startActivity(intent);
        });

        ImageView profileimg = findViewById(R.id.imageView19);
        profileimg.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity7.this, MainActivity8.class);
            startActivity(intent);
        });



    }
}