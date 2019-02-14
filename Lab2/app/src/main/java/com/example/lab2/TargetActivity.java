package com.example.lab2;


import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

public class TargetActivity extends AppCompatActivity {
    Intent currentIntent;
    TextView myTextView;
    String nameSent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target);
        currentIntent = getIntent();
        nameSent = currentIntent.getStringExtra("nameToSend");
        myTextView = findViewById(R.id.textView);
        myTextView.setText(nameSent);
    }
}
