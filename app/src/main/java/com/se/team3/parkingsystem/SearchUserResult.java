package com.se.team3.parkingsystem;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;



public class SearchUserResult extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    UserSessionManager session;
    Bundle bundle;
    String[] u;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_user_details);



        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        bundle = getIntent().getExtras();


        TextView FirstName = (TextView)findViewById(R.id.textView11);
        FirstName.setText("First name : "+bundle.getString("FN"));

        TextView LastName = (TextView)findViewById(R.id.pmParkingSpotDetailsText0);
        LastName.setText("Last Name : "+bundle.getString("LN"));

        TextView Role = (TextView)findViewById(R.id.pmParkingSpotDetailsFName);
        Role.setText("Role : "+bundle.getString("Role"));

        TextView Revoke = (TextView)findViewById(R.id.pmParkingSpotDetailsLName);
        Revoke.setText("Revoke Status : "+bundle.getString("Permit type"));


    }



    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new RevokeFragment(), "Revoke");
        adapter.addFragment(new RoleFragment(), "Role Change");
  //      adapter.addFragment(new ProfileFragment(), "Edit Profile");
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }

        public void addFragment(Fragment fragment, String title) {
            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }
    }


    public void edit_user(View view){
        Intent i = new Intent(SearchUserResult.this,AdminEditUser.class);
        bundle = getIntent().getExtras();
        bundle.putString("FN", bundle.getString("FN"));
        bundle.putString("LN", bundle.getString("LN"));
        bundle.putString("email", bundle.getString("e"));
        bundle.putString("phone", bundle.getString("p"));
        startActivity(i);
    }

    public void aaudlo (View view) {
        if(view.getId() == R.id.adminHomeScreenLogoutButton) {
            session.logoutUser();
        }
    }
}