package com.nkufall2021.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Log statement to debug
        Log.d(TAG, "Hello World");

        // Log statement to handle errors
        Log.e(TAG, "Message was not delivered");
    }
}