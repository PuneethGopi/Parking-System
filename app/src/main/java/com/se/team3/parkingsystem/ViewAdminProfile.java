package com.se.team3.parkingsystem;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


@SuppressLint("Registered")
public class ViewAdminProfile extends AppCompatActivity {
Button Update;
    UserSessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_user_profile);
        session = new UserSessionManager(getApplicationContext());
        Update = findViewById(R.id.loginButton);
        Update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(ViewAdminProfile.this,UpdateAdminProfile.class);
                startActivity(u);
            }
        });


    }
}