package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class OngoingVehicle extends AppCompatActivity {

    public CardView carcadmy1, carcadmy2, carcadmy3, carcadmy4, carcadmy5, carcadmy6, carcadmy7, carcadmy8, carcadmy9, carcadmy10;
    public CardView carcadmy11, carcadmy12, carcadmy13, carcadmy14, carcadmy15, carcadmy16, carcadmy17, carcadmy18;
    Dialog mydialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ongoing_vehicle);

        carcadmy1 = (CardView) findViewById(R.id.carcard1);
        carcadmy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdemoDialog();
            }
        });

        carcadmy2 = (CardView) findViewById(R.id.carcard2);
        carcadmy2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdemoDialog();
            }
        });
        carcadmy3 = (CardView) findViewById(R.id.carcard3);
        carcadmy3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdemoDialog();
            }
        });
        carcadmy4 = (CardView) findViewById(R.id.carcard4);
        carcadmy4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdemoDialog();
            }
        });
        carcadmy5 = (CardView) findViewById(R.id.carcard5);
        carcadmy5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdemoDialog();
            }
        });
        carcadmy6 = (CardView) findViewById(R.id.carcard6);
        carcadmy6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdemoDialog();
            }
        });
        carcadmy7 = (CardView) findViewById(R.id.carcard7);
        carcadmy7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdemoDialog();
            }
        });
        carcadmy8 = (CardView) findViewById(R.id.carcard8);
        carcadmy8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdemoDialog();
            }
        });
        carcadmy9 = (CardView) findViewById(R.id.carcard9);
        carcadmy9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdemoDialog();
            }
        });
        carcadmy10 = (CardView) findViewById(R.id.carcard10);
        carcadmy10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdemoDialog();
            }
        });
        carcadmy11 = (CardView) findViewById(R.id.carcard11);
        carcadmy11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdemoDialog();
            }
        });
        carcadmy12 = (CardView) findViewById(R.id.carcard12);
        carcadmy12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdemoDialog();
            }
        });
        carcadmy13 = (CardView) findViewById(R.id.carcard13);
        carcadmy13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdemoDialog();
            }
        });
        carcadmy14 = (CardView) findViewById(R.id.carcard14);
        carcadmy14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdemoDialog();
            }
        });
        carcadmy15 = (CardView) findViewById(R.id.carcard15);
        carcadmy15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdemoDialog();
            }
        });
        carcadmy16 = (CardView) findViewById(R.id.carcard16);
        carcadmy16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdemoDialog();
            }
        });
        carcadmy17 = (CardView) findViewById(R.id.carcard17);
        carcadmy17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdemoDialog();
            }
        });
        carcadmy18 = (CardView) findViewById(R.id.carcard18);
        carcadmy18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showdemoDialog();
            }
        });


    }

    public void showdemoDialog() {
        Dialog mydialog = new Dialog(OngoingVehicle.this);
        mydialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        mydialog.setContentView(R.layout.activity_ongoing_demo_data);

        Button dialogbtn = mydialog.findViewById(R.id.btn_ongoing_ok);
        dialogbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });

        mydialog.show();
    }

    public void goBack() {
        Intent i = new Intent(this, OngoingVehicle.class);
        startActivity(i);
    }
}