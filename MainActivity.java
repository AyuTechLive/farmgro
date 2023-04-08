package com.ayush.finaldraft;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;
    homeFragment homeFragment = new homeFragment();
    expertFragment expertFragment = new expertFragment();
    scheduleFragment scheduleFragment = new scheduleFragment();
    storeFragment storeFragment = new storeFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(MenuItem item){
                switch (item.getItemId()){
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,homeFragment).commit();
                        return true;
                    case R.id.expert:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,expertFragment).commit();
                        return true;
                    case R.id.schedule:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,scheduleFragment).commit();
                        return true;
                    case R.id.store:
                        getSupportFragmentManager().beginTransaction().replace(R.id.container,storeFragment).commit();
                        return true;
                }
                return false;
            }
        });
    }
}