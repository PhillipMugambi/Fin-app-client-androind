package com.example.invoiceapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Home_page extends AppCompatActivity {

    // variable for shared preferences.
    SharedPreferences preferences;
    Dialog dialog;
    Button apply;
    Button Logout;
    Button button4;
    private static final String BASE_URL = "http://192.168.1.3:7001/LoanApplication/";
    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        Logout = findViewById(R.id.logout);
        apply = findViewById(R.id.loan);
        apply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(Home_page.this, loanApplication_page.class);
                startActivity(i);
            }
        });


        Logout.setOnClickListener(new View.OnClickListener() {
            //tis will remove sessions and return to login screen

            @Override
            public void onClick(View v) {
                Sessionsmanagement sessionmanagement= new Sessionsmanagement(Home_page.this);
                sessionmanagement.RemoveSession();

                Intent i;
                i = new Intent(Home_page.this, MainActivity.class);
                startActivity(i);
            }
        });
        }
    }
