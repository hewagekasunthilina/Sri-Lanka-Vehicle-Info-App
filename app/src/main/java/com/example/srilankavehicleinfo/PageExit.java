package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageExit extends AppCompatActivity {
    //btn_exit_yes
    Button nobutton, yesbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit_page);
        nobutton = (Button) findViewById(R.id.btn_exit_no);
        nobutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                viewData();
            }
        });

        yesbutton = (Button) findViewById(R.id.btn_exit_yes);
        yesbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Exitpage();
            }
        });

    }

    public void viewData() {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void Exitpage() {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}