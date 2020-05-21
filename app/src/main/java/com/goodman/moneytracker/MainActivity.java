package com.goodman.moneytracker;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MainActivity", "OnStart");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MainActivity", "OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MainActivity", "OnDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MainActivity", "OnPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MainActivity", "OnResume");
    }
}
