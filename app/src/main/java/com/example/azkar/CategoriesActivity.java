package com.example.azkar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.app.StatusBarManager;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

import com.example.azkar.Fragments.AboutAppFragment;
import com.example.azkar.Fragments.AzkarListFragment;
import com.example.azkar.Fragments.FavouriteFragment;
import com.example.azkar.Fragments.RamadanQuastionsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class CategoriesActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        bottomNavigation = findViewById(R.id.bottom_navigation);
        openFragment(new AzkarListFragment()); // default fragment

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()){
                    case R.id.azkar_list_item:
                        fragment=new AzkarListFragment();

                       break;
                    case R.id.favourite_item:
                        fragment=new FavouriteFragment();
                        break;
                    case R.id.ramadan_quastions_item:
                        fragment=new RamadanQuastionsFragment();
                        break;
                    case R.id.about_as_item:
                        fragment=new AboutAppFragment();
                        break;
                }
                return openFragment(fragment);
            }
        });


    }

    public boolean openFragment(Fragment fragment) {
        if (fragment != null) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.viewpager, fragment);
            transaction.commit();
        }

        return false;
    }

}