package com.example.policescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Criminal_Record extends AppCompatActivity {

    Button Status;
    Button M_List;
    Button B_List;
    Button A_List;
    Button main_menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criminal_record);

        Status = findViewById(R.id.check_history);
        M_List = findViewById(R.id.m_button);
        B_List = findViewById(R.id.button3);
        A_List = findViewById(R.id.button4);
        main_menu = findViewById(R.id.c_button);

        Status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent criminal_record = new Intent(Criminal_Record.this, CheckHistory.class);
                startActivity(criminal_record);
            }
        });

        M_List.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent criminal_record = new Intent(Criminal_Record.this, MostWantedList.class);
                startActivity(criminal_record);
            }
        });

        B_List.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent criminal_record = new Intent(Criminal_Record.this, Bounty.class);
                startActivity(criminal_record);
            }
        });

        A_List.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent criminal_record = new Intent(Criminal_Record.this, ArrestList.class);
                startActivity(criminal_record);
            }
        });

        main_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent criminal_record = new Intent(Criminal_Record.this, MainPage.class);
                startActivity(criminal_record);
            }
        });

    }
}