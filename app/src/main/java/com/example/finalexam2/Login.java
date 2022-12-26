package com.example.finalexam2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button loginButton;

    public final static String USERNAME="com.example.finalexam.USERNAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //untuk declare username,pass,button
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        loginButton = findViewById(R.id.btnLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                etUsername = findViewById(R.id.etUsername);
                etPassword = findViewById(R.id.etPassword);
                loginButton = findViewById(R.id.btnLogin);

                String username=etUsername.getText().toString();
                String pass=etPassword.getText().toString();

                //yg di dh set waktu user masukkan username & pass
                if (username.equals("hidyhfauzi") && pass.equals("020626")) {

                    //intent ni untuk navigate to mainpage
                    Intent intent = new Intent(Login.this, Display.class);
                    intent.putExtra("USERNAME",username);
                    startActivity(intent);
                } else {
                    //ni untuk panggil alert dialog
                    ShowAlertDialogButton();
                }
            }
        });
    }
    public void ShowAlertDialogButton(){
        //untuk setup alert builder
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("Authentication Failed");
        builder.setMessage("The username and password are incorrect. Please reenter again!");

        //untuk add button
        builder.setPositiveButton("OKEY",null);
        //untuk create dan show alert dialog
        AlertDialog dialog=builder.create();
        dialog.show();
    }

}
