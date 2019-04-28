package com.se.team3.parkingsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateAdminProfile extends AppCompatActivity {
Button update;
String S = "Update SuccessFull";
    UserSessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);
        session = new UserSessionManager(getApplicationContext());
        update = findViewById(R.id.loginButton);
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),S,Toast.LENGTH_SHORT).show();

            }
        });


    }
}
