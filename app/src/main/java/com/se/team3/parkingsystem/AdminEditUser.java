package com.se.team3.parkingsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

class AdminEditUser extends AppCompatActivity {
    UserHome uh= new UserHome();
    Bundle bundle;
    UserSessionManager session;
    DatabaseHelper helper = new DatabaseHelper(this);
    HashMap<String, String> userDetails;
    String user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_edit_user_details);
        session = new UserSessionManager(getApplicationContext());

//        bundle = getIntent().getExtras();
//        EditText fn = (EditText) findViewById(R.id.entry);
//        fn.setText(bundle.getString("FN"));
//
//        EditText ln = (EditText) findViewById(R.id.entry1);
//        ln.setText(bundle.getString("LN"));
//
//        EditText email = (EditText) findViewById(R.id.entry2);
//        email.setText(bundle.getString("e"));
//
//        EditText phone = (EditText) findViewById(R.id.entry3);
//        phone.setText(bundle.getString("p"));


    }

//    public void Admin_user_update(View view){
//        if (view.getId() == R.id.update1) {
//            session = new UserSessionManager(getApplicationContext());
//            userDetails = session.getUserDetails();
//            user = userDetails.get(session.KEY_NAME);
//            EditText fn = findViewById(R.id.entry);
//            EditText ln = findViewById(R.id.entry1);
//            EditText email = findViewById(R.id.entry2);
//            EditText Phone = findViewById(R.id.entry3);
//
//            String lnameString = ln.getText().toString();
//            String fnameString = fn.getText().toString();
//            String phoneString = Phone.getText().toString();
//            String emailString = email.getText().toString();
//            boolean uptodate= (boolean) helper.upDateUserDetails1(user,lnameString,fnameString,phoneString,emailString);
//
//            if(uptodate) {
//                Toast toast = Toast.makeText(AdminEditUser.this, " Updated Successfully", Toast.LENGTH_LONG);
//                toast.show();
//
//                Intent intent = new Intent(this, SearchUserResult.class);
//
//                startActivity(intent);
//                finish();
//            }
//            if(!uptodate) {
//                Toast toast = Toast.makeText(AdminEditUser.this, " input field cannot be empty", Toast.LENGTH_LONG);
//                toast.show();
//            }
//    }



}
