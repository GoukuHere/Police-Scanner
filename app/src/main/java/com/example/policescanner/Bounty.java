package com.example.policescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Bounty extends AppCompatActivity {

    Button c_record3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bounty);

        c_record3 = findViewById(R.id.b_button);

        c_record3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent b_page = new Intent(Bounty.this, Criminal_Record.class);
                startActivity(b_page);
            }
        });
    }
}