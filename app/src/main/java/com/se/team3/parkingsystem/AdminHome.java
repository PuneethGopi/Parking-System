package com.se.team3.parkingsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class AdminHome extends AppCompatActivity {
Button UserS;
Button Profile;
    UserSessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_home_screen);
        session = new UserSessionManager(getApplicationContext());
        UserS = findViewById(R.id.adsearchuser);
        UserS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AdminHome.this, SearchUser.class);
                startActivity(i);
            }
        });

        Profile = findViewById(R.id.adviewprofile);
        Profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p = new Intent(AdminHome.this, ViewAdminProfile.class);
                startActivity(p);
            }
        })
        ;
    }

    public void adminHomeScreenLogout (View view) {
        if(view.getId() == R.id.adminHomeScreenLogoutButton) {
            session.logoutUser();
        }
    }




}
