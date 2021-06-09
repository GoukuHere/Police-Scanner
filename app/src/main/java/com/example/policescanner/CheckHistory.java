package com.example.policescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class CheckHistory extends AppCompatActivity {

    Button check;
    EditText CNIC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_history);

        check = findViewById(R.id.check_btn);
        CNIC = findViewById(R.id.check_cnic);


        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String cnic = CNIC.getText().toString();
                if ((cnic.equals("6110113838199"))) {

                    Intent check_history = new Intent(CheckHistory.this, StatusPage.class);
                    startActivity(check_history);
                } else {

                    Toast.makeText(CheckHistory.this, "Invalid CNIC!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    }