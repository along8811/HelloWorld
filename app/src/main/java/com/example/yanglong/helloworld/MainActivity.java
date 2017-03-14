package com.example.yanglong.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String DEBUG_TAG = "HelloWorld";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(DEBUG_TAG,"In the OnCreate() method of the MainActivity.Class");
    }
}
