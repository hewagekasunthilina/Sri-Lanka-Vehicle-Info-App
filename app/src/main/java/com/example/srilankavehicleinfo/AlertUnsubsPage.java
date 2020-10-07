package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class AlertUnsubsPage extends AppCompatActivity {

    private static final Pattern UnSubPassword_Pattern =
            Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}$");


    private EditText textInputUnSubPassword;
    private EditText textInputUnSubContact;
    private ImageView UnSubPassword_see;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_unsubs_page);

        textInputUnSubPassword = findViewById(R.id.txt_UnsubPwd);
        textInputUnSubContact = findViewById(R.id.txt_UnsubContactNum);
        UnSubPassword_see = (ImageView) findViewById(R.id.unsub_pwd_see);
    }

    private boolean UnsubvalidatePassword() {
        String UnSubPasswordInput = textInputUnSubPassword.getText().toString().trim();

        if (UnSubPasswordInput.isEmpty()) {
            textInputUnSubPassword.setError("Field Can't be Empty");
            return false;
        } else if (!UnSubPassword_Pattern.matcher(UnSubPasswordInput).matches()) {
            textInputUnSubPassword.setError("Incorrect Password");
            return false;
        } else {
            textInputUnSubPassword.setError(null);

            return true;
        }
    }

    private boolean UnsubvalidateContact() {
        String UnsubConatactInput = textInputUnSubContact.getText().toString().trim();

        if (UnsubConatactInput.isEmpty()) {
            textInputUnSubContact.setError("Field Can't be Empty");
            return false;
        } else if (UnsubConatactInput.length() != 10) {
            textInputUnSubContact.setError("Please Enter a Valid Contact Number");
            return false;
        } else {
            textInputUnSubContact.setError(null);

            return true;
        }

    }

    public void confirmUnSubscribe(View view) {
        if (!UnsubvalidatePassword() | !UnsubvalidateContact()) {
            return;
        }



        String input = "Contact: " + textInputUnSubContact.getText().toString();
        input += "\n";
        input += "Password: " + textInputUnSubPassword.getText().toString();

        Toast.makeText(this,input,Toast.LENGTH_SHORT).show();
    }

    public void UnsubPassword_see(View view) {
        if (UnSubPassword_see.getTag() != null && UnSubPassword_see.getTag().toString().equals("eye")) {
            UnSubPassword_see.setImageResource(R.drawable.hide_eye);
            UnSubPassword_see.setTag("hide_eye");
            textInputUnSubPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else if (UnSubPassword_see.getTag() != null && UnSubPassword_see.getTag().toString().equals("hide_eye")) {
            UnSubPassword_see.setImageResource(R.drawable.eye);
            UnSubPassword_see.setTag("eye");
            textInputUnSubPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}