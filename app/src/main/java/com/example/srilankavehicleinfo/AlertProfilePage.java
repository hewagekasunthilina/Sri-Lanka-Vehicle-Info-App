package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;

public class AlertProfilePage extends AppCompatActivity {

    private EditText textInputProEmail;
    private EditText textInputProContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_profile_page);

        textInputProEmail = findViewById(R.id.txt_proEmail);
        textInputProContact = findViewById(R.id.txt_proContact);
    }

    private boolean validateProEmail() {
        String ProEmailInput = textInputProEmail.getText().toString().trim();

        if (ProEmailInput.isEmpty()) {
            textInputProEmail.setError("Field Can't be Empty");
            return false;

        } else if (!Patterns.EMAIL_ADDRESS.matcher(ProEmailInput).matches()) {
            textInputProEmail.setError("Please Enter a valid Email");
            return false;
        } else {
            textInputProEmail.setError(null);

            return true;
        }
    }


    private boolean validateProContact() {
        String ProConatactInput = textInputProContact.getText().toString().trim();

        if (ProConatactInput.isEmpty()) {
            textInputProContact.setError("Field Can't be Empty");
            return false;
        } else if (ProConatactInput.length() != 10) {
            textInputProContact.setError("Please Enter a Valid Contact Number");
            return false;
        } else {
            textInputProContact.setError(null);

            return true;
        }
    }

    public void confirmProfile(View v) {
        if (!validateProEmail() | !validateProContact()) {
            return;
        }


    }
}