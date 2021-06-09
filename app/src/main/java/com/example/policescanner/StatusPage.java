package com.example.policescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StatusPage extends AppCompatActivity {

    Button c_record;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_status_page);

        c_record = findViewById(R.id.criminal_button2);

        c_record.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent status_page = new Intent(StatusPage.this, Criminal_Record.class);
                startActivity(status_page);
            }
        });
    }
}