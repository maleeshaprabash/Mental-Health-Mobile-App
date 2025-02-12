package com.example.evervital;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);

        TextView create_new_account = findViewById(R.id.textView);
        create_new_account.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
            startActivity(intent);
        });

        Button loginbtn = findViewById(R.id.button2);
        loginbtn.setOnClickListener(v ->{
            Intent intent = new Intent(MainActivity2.this, MainActivity4.class);
            startActivity(intent);
        });

        imageView = findViewById(R.id.imageView28);
        imageView.setOnClickListener(v -> {
            Uri uri = Uri.parse("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https%3A%2F%2Fmail.google.com%2Fmail&ec=GAlAFw&hl=en-GB&service=mail&flowName=GlifWebSignIn&flowEntry=AddSession&dsh=S-820353776%3A1739011542649368&ddm=1");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });

        imageView = findViewById(R.id.imageView29);
        imageView.setOnClickListener(v -> {
            Uri uri = Uri.parse("https://web.facebook.com/?_rdc=1&_rdr");
            Intent intent = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(intent);
        });
    }
}