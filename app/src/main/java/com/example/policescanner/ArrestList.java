package com.example.policescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArrestList extends AppCompatActivity {


    Button c_record4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arrest_list);

        c_record4 = findViewById(R.id.a_button);

        c_record4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a_page = new Intent(ArrestList.this, Criminal_Record.class);
                startActivity(a_page);
            }
        });
    }
}