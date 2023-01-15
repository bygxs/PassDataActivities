package com.biniyam.passdataactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {
    final String TAG = "demo";
    final static public String NAME_KEY = "NAME";
    final static public String USER_KEY = "USER";


    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"onCreate");

        setTitle("Main Activity");

        button = findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
               // intent.putExtra(NAME_KEY,"Bob Smith");
                // a serializable method of an object
                intent.putExtra(USER_KEY, new User("Bob Smith",24));
                startActivity(intent);

            }
        });



    }
}