package com.example.evervital;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);

        TextView Login = findViewById(R.id.textView5);
        Login.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity3.this, MainActivity2.class);
            startActivity(intent);
        });
    }
}