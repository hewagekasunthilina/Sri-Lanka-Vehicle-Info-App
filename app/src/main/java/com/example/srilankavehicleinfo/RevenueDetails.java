package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RevenueDetails extends AppCompatActivity {
    //RevlicenceData
    private Button mybutton;
    EditText mynum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revenue_details);

        mybutton = (Button) findViewById(R.id.submitbtnrev);
        mynum = (EditText) findViewById(R.id.revnumbertxt);
        mybutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String number = mynum.getText().toString().trim();

                if (number.isEmpty()) {
                    mynum.setError("Field Can't be Empty");
                } else {
                    viewData();
                }


            }
        });

    }

    public void viewData() {
        Intent i = new Intent(this, RevlicenceData.class);
        startActivity(i);
    }

}