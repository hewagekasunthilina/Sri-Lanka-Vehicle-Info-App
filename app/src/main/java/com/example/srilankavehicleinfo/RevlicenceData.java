package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RevlicenceData extends AppCompatActivity {
    //btn_rev_ok
    Button revokbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revlicencedata);

        revokbtn = (Button) findViewById(R.id.btn_rev_ok);
        revokbtn.setOnClickListener(new View.OnClickListener() {
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