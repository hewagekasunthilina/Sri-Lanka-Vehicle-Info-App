package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public CardView cd1, cd2, cd3, cd4, cd5, cd6;
    private CardView vehicleSubmit;
    private CardView licenseAlert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cd1 = (CardView) findViewById(R.id.dashcard1);
        cd2 = (CardView) findViewById(R.id.dashcard2);
        /*cd3 = (CardView) findViewById(R.id.dashcard3);*/
        cd4 = (CardView) findViewById(R.id.dashcard4);
        cd5 = (CardView) findViewById(R.id.dashcard5);
        cd6 = (CardView) findViewById(R.id.dashcard5);


        cd1.setOnClickListener(this);
        cd2.setOnClickListener(this);
        /*cd3.setOnClickListener(this);*/
        cd4.setOnClickListener(this);
        cd5.setOnClickListener(this);
        cd6.setOnClickListener(this);

        vehicleSubmit = (CardView) findViewById(R.id.detail);
        vehicleSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVehicleSubmitNumberPage();
            }
        });

        licenseAlert = (CardView) findViewById(R.id.dashcard4);
        licenseAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRevenueLicenseAlertPage();
            }
        });

    }

    private void openVehicleSubmitNumberPage() {
        Intent submitNumber = new Intent(this, SubmitNumber.class);
        startActivity(submitNumber);
    }

    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.dashcard1:
                i = new Intent(this, OngoingVehicle.class);
                startActivity(i);
                break;
            case R.id.dashcard2:
                i = new Intent(this, RevenueDetails.class);
                startActivity(i);
                break;
           /* case R.id.dashcard3:
                i = new Intent(this,SubmitNumber.class);
                startActivity(i);
                break;*/
//            case R.id.dashcard4:
//                i = new Intent(this, AlertNavigation.class);
//                startActivity(i);
//                break;
            case R.id.dashcard5:
                showdemoDialog();
                break;

        }
    }

    public void showdemoDialog() {
        Dialog mydialog = new Dialog(MainActivity.this);
        mydialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        mydialog.setContentView(R.layout.activity_exit_page);

        Button dialogbtn1 = mydialog.findViewById(R.id.btn_exit_no);
        dialogbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
            }
        });


        Button dialogbtn2 = mydialog.findViewById(R.id.btn_exit_yes);
        dialogbtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Exitpage();
            }
        });

        mydialog.show();
    }


    public void goBack() {
        Intent i = new Intent(this, OngoingVehicle.class);
        startActivity(i);
    }

    public void Exitpage() {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);

/*    public void openRevenueAlertNav() {
        Intent intent = new Intent(this, AlertNavigation.class);
        startActivity(intent);
    }*/


    }


    public void openRevenueLicenseAlertPage() {
        Intent alert = new Intent(this, LicenseAlertMainPage.class);
        startActivity(alert);
    }
}