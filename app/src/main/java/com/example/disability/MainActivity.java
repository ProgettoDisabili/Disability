package com.example.disability;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private static final String EXTRA_MESSAGE = "hey";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Intent intent = new Intent(this, LogInMain.class);
        startActivity(intent);

        //Intent intent = new Intent(this, HomePageMain.class);
        //startActivity(intent);
    }
}
