package com.example.finalexam2;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class Display extends AppCompatActivity {

    TextView tvUsername;

    public final static String USERNAME="com.example.finalexam2.USERNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        //untuk panggil data daripada login
        Intent intent=getIntent();
        String strUsername=intent.getStringExtra("USERNAME");
        tvUsername=(TextView)findViewById(R.id.tvUsername);
        tvUsername.setText(strUsername);


    }
}