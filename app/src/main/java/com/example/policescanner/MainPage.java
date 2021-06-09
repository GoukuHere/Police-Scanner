package com.example.policescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainPage extends AppCompatActivity {

    ImageButton Criminal;
    ImageButton logout;
    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        Criminal = findViewById(R.id.criminal50);
        logout = findViewById(R.id.logout_button);

        Criminal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main_page = new Intent(MainPage.this, Criminal_Record.class);
                startActivity(main_page);
            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent main_page = new Intent(MainPage.this, MainActivity.class);
                startActivity(main_page);
            }
        });
        }

    }