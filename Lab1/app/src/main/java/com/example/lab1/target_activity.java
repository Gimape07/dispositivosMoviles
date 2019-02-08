package com.example.lab1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class target_activity extends AppCompatActivity{
    TextView myTextView;
    Intent currentIntent;
    String myString2;
    int myInteger2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_target_activity);

        currentIntent = getIntent();
        myString2 = currentIntent.getStringExtra("myStringName");
        myInteger2 = currentIntent.getIntExtra("myInteger", 0);

    }
}