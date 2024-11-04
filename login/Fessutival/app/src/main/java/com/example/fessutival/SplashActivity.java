package com.example.fessutival;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        // splash 3초동안
        Handler handler = new Handler();
        handler.postDelayed(new splashHandler(), 3000);
    }

    private class splashHandler implements Runnable {
        @Override
        public void run() {
            startActivity(new Intent(getApplication(), LogIn.class));
            SplashActivity.this.finish();
        }
    }
}