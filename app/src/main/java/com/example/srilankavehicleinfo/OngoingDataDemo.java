package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OngoingDataDemo extends AppCompatActivity {
    //btn_ongoing_ok
    Button ongoingokbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ongoing_demo_data);

        ongoingokbtn = (Button) findViewById(R.id.btn_ongoing_ok);
        ongoingokbtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                viewData();
            }
        });

    }

    public void viewData() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}