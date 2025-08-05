package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("Activity Created");

        Button onCreateButton=findViewById(R.id.onCreateButton);
        Button onStartButton=findViewById(R.id.onStartButton);
        Button onPauseButton=findViewById(R.id.PauseButton);
        Button onStopButton=findViewById(R.id.onStopButton);
        Button onRestartButton=findViewById(R.id.RestartButton);
        Button onDestroyButton=findViewById(R.id.onDestroyButton);

        onCreateButton.setOnClickListener(view -> showToast("onCreate()Clicked"));
        onStartButton.setOnClickListener(view -> showToast("onStart()Clicked"));
        onPauseButton.setOnClickListener(view -> showToast("onPause()Clicked"));
        onRestartButton.setOnClickListener(view -> showToast("onRestart()Clicked"));
        onDestroyButton.setOnClickListener(v -> showToast("onDestroy() Clicked"));

    }
    @Override
    protected void onStart() {
        super.onStart();
        showToast("Activity Started");
    }
    @Override
    protected void onResume() {
        super.onResume();
        showToast("Activity Resumed");
    }
    @Override
    protected void onPause() {
        super.onPause();
        showToast("Activity Paused");
    }
    @Override
    protected void onStop() {
        super.onStop();
        showToast("Activity Stopped");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        showToast("Activity Restarted");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("Activity Destroyed");
    }
    void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}