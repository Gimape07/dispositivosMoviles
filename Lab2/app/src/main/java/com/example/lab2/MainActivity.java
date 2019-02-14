package com.example.lab2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    EditText name;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        name = findViewById(R.id.simpleEditText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent myIntent = new Intent(MainActivity.this, TargetActivity.class);
                String sendName= name.getText().toString();
                myIntent.putExtra("nameToSend", "Welcome! " + sendName);
                startActivity(myIntent);
            }
        });
    }
}
