package com.example.azkar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

public class PrayerTimingsActivity extends AppCompatActivity {

    private Toolbar toolbarPrayer_timings;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prayer_timings);

        toolbarPrayer_timings=findViewById(R.id.toolbar_prayer_timings_activity);
        setSupportActionBar(toolbarPrayer_timings);
        getSupportActionBar().setTitle("");
        toolbarPrayer_timings.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

}
