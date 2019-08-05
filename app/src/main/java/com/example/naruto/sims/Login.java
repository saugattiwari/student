package com.example.naruto.sims;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity implements View.OnClickListener{

    EditText email,password;
    Button btnlogin, btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login");


        btnlogin=(Button) findViewById(R.id.btn_login);
        btnregister=(Button) findViewById(R.id.btn_register);
        btnregister.setOnClickListener(this);
        btnlogin.setOnClickListener(this);
        email = findViewById(R.id.email);
        password = findViewById(R.id.pwd);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_login :


                break;
            case R.id.btn_register:

                break;

        }
    }
}
