package com.example.fessutival;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.fessutival.schedule.Calendar;

public class LogIn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void bt_login_onClick(View v){
        Button bt_login = findViewById(R.id.bt_login);

        // LogIn 액티비티로 이동
        Intent intent = new Intent(LogIn.this, Calendar.class);
        startActivity(intent);
    }
}