package com.example.mirrorhirringp2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login_Form extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__form);
        getSupportActionBar().setTitle("Login_Form");
    }

    public void btn_signupForm(View view) {
        startActivity(new Intent(getApplicationContext(),Sugnup_Form.class));
    }
}