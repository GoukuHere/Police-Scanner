package com.example.policescanner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MostWantedList extends AppCompatActivity {

    Button c_record2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_most_wanted_list);

        c_record2 = findViewById(R.id.criminal_button2);

        c_record2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m_page = new Intent(MostWantedList.this, Criminal_Record.class);
                startActivity(m_page);
            }
        });
    }
}