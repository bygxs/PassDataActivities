package com.biniyam.passdataactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textViewGreeting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewGreeting = findViewById(R.id.textViewGreeting);

        if(getIntent()!=null && getIntent().getExtras() !=null && getIntent().hasExtra(MainActivity.USER_KEY)){
           User user = (User) getIntent().getSerializableExtra(MainActivity.USER_KEY);

            String name = getIntent().getStringExtra(MainActivity.NAME_KEY);
            //textViewGreeting.setText("hello "+ name);
            textViewGreeting.setText("hello "+ user.name);
        }
        setTitle("second activity");

        findViewById(R.id.button2).setOnClickListener(v -> {finish();});

    }
}