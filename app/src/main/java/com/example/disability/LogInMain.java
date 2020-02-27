package com.example.disability;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class LogInMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in_main);
    }


    public void sendMessage(View view) {
        Intent intent = new Intent(this, HomePageMain.class);
        EditText editText = (EditText) findViewById(R.id.editTextUSN);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }

    public void redirectRegistration(View view) {
        Intent intent = new Intent(this, MainActivitySelectionRegistration.class);
        startActivity(intent);
    }
}
