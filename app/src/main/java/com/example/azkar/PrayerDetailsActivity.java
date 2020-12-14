package com.example.azkar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.azkar.Adapters.PrayerDetailsPagerAdapter;
import com.example.azkar.Fragments.PrayerDetailsPagerFragment;

import java.util.ArrayList;
import java.util.List;

public class PrayerDetailsActivity extends AppCompatActivity implements PrayerDetailsPagerFragment.OnFragmentInteractionListener {

    private Toolbar toolbar;
    private ViewPager viewPager;
    private PrayerDetailsPagerAdapter adapter;
    private List<Fragment> list;
    private ImageView prev,next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer_details);


        toolbar=findViewById(R.id.toolbar_prayer_details_activity);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        String s1 = (String) getResources().getText(R.string.tv_prayer_details_fragment);
        String s2 = (String) getResources().getText(R.string.tv_source_prayer_details_fragment);
        viewPager = findViewById(R.id.viewpager_prayer_details);
        list = new ArrayList<>();
        list.add(PrayerDetailsPagerFragment.newInstance("3","ثلاثة مرات",s1,s2,0,"اضافة للمفضلة"));
        list.add(PrayerDetailsPagerFragment.newInstance("3","ثلاثة مرات",s1,s2,0,"اضافة للمفضلة"));
        list.add(PrayerDetailsPagerFragment.newInstance("3","ثلاثة مرات",s1,s2,0,"اضافة للمفضلة"));
        list.add(PrayerDetailsPagerFragment.newInstance("3","ثلاثة مرات",s1,s2,0,"اضافة للمفضلة"));
        adapter=new PrayerDetailsPagerAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(adapter);

        prev=findViewById(R.id.previous_button);
        next=findViewById(R.id.next_button);
        prev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(getItem(-1),true);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(getItem(+1),true);
            }
        });

    }

    private int getItem(int i) {
        return viewPager.getCurrentItem()+i;
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
