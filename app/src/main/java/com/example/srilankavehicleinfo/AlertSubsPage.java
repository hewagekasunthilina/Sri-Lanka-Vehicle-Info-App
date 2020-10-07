package com.example.srilankavehicleinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class AlertSubsPage extends AppCompatActivity {

    private static final Pattern SubPassword_Pattern =
            Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{6,}$");

    private EditText textInputEmail;
    private EditText textInputPassword;
    private EditText TextInputName;
    private EditText textInputContact;
    private ImageView Password_see;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_subs_page);

        textInputEmail = findViewById(R.id.sub_TextEmail);
        textInputPassword = findViewById(R.id.sub_TextPwd);
        TextInputName = findViewById(R.id.sub_textName);
        textInputContact = findViewById(R.id.sub_txtContact);
        Password_see = (ImageView) findViewById(R.id.pwd_see);
    }

    private boolean validateEmail() {
        String EmailInput = textInputEmail.getText().toString().trim();

        if (EmailInput.isEmpty()) {
            textInputEmail.setError("Field Can't be Empty");
            return false;

        } else if (!Patterns.EMAIL_ADDRESS.matcher(EmailInput).matches()) {
            textInputEmail.setError("Please Enter a valid Email");
            return false;
        } else {
            textInputEmail.setError(null);

            return true;
        }
    }

    private boolean validateName() {
        String NameInput = TextInputName.getText().toString().trim();

        if (NameInput.isEmpty()) {
            TextInputName.setError("Field Can't be Empty");
            return false;
        } else {
            TextInputName.setError(null);

            return true;
        }
    }

    private boolean validatePassword() {
        String PasswordInput = textInputPassword.getText().toString().trim();

        if (PasswordInput.isEmpty()) {
            textInputPassword.setError("Field Can't be Empty");
            return false;
        } else if (!SubPassword_Pattern.matcher(PasswordInput).matches()) {
            textInputPassword.setError("Incorrect Password");
            return false;
        } else {
            textInputPassword.setError(null);

            return true;
        }
    }

    private boolean validateContact() {
        String ConatactInput = textInputContact.getText().toString().trim();

        if (ConatactInput.isEmpty()) {
            textInputContact.setError("Field Can't be Empty");
            return false;
        } else if (ConatactInput.length() != 10) {
            textInputContact.setError("Please Enter a Valid Contact Number");
            return false;
        } else {
            textInputContact.setError(null);

            return true;
        }
    }

    public void confirmSubscribe(View v) {
        if (!validateEmail() | !validateContact() | !validateName() | !validatePassword()) {
            return;
        }

        String input = "Email: " + textInputEmail.getText().toString();
        input += "\n";
        input += "Name: " + TextInputName.getText().toString();
        input += "\n";
        input += "Contact: " + textInputContact.getText().toString();
        input += "\n";
        input += "Password: " + textInputPassword.getText().toString();

        Toast.makeText(this, input, Toast.LENGTH_SHORT).show();
    }

    public void Password_see(View view) {
        if (Password_see.getTag() != null && Password_see.getTag().toString().equals("eye")) {
            Password_see.setImageResource(R.drawable.hide_eye);
            Password_see.setTag("hide_eye");
            textInputPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
        } else if (Password_see.getTag() != null && Password_see.getTag().toString().equals("hide_eye")) {
            Password_see.setImageResource(R.drawable.eye);
            Password_see.setTag("eye");
            textInputPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }

    }
}
