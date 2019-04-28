package com.se.team3.parkingsystem;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


@SuppressLint("Registered")
public class SearchUser extends AppCompatActivity {
String userSearch;
DatabaseHelper helper = new DatabaseHelper(this);
    UserSessionManager session;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pm_user_details);
        session = new UserSessionManager(getApplicationContext());

    }
   public void Search(View view){
       Intent i = new Intent(SearchUser.this,SearchUserResult.class);


       EditText name = findViewById(R.id.editText);

       String nameString = name.getText().toString();

       String[] un = helper.profileDetails(nameString);
       Bundle bundle;
       bundle = new Bundle();
       bundle.putString("FN", un[3]);
       bundle.putString("LN", un[2]);
       bundle.putString("Role", un[5]);
       bundle.putString("permit type", un[15]);

       bundle.putString("e", un[8]);
       bundle.putString("p", un[7]);

       i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
       i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
       i.putExtras(bundle);
       startActivity(i);

    }

    public void apudlo (View view) {
        if(view.getId() == R.id.aaud) {
            session.logoutUser();
        }
    }
}