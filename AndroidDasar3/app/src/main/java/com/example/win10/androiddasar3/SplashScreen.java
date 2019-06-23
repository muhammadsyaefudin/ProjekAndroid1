package com.example.win10.androiddasar3;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler handler  = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent pindah  = new Intent(SplashScreen.this,AndroidDasar3List.class);
                startActivity(pindah);
                finish();
            }
        }, 3000);
    }
}
