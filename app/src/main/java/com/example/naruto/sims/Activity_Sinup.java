package com.example.naruto.sims;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_Sinup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__sinup);
        getSupportActionBar().setTitle("Signup Form");
    }
}
