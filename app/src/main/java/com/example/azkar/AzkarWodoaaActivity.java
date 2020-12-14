package com.example.azkar;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.azkar.Adapters.AzkarWodoaaAdapter;
import com.example.azkar.Models.AzkarWodoaa;

import java.util.ArrayList;

public class AzkarWodoaaActivity extends AppCompatActivity {

    private RecyclerView recyclerView2;
    private ArrayList<AzkarWodoaa> arrayList;
    private AzkarWodoaaAdapter azkarWodoaaAdapter;
    private Toolbar toolbarAzkarWodoaa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_azkar_wodoaa);

        recyclerView2=findViewById(R.id.recycler_azkar_wodoaa);

        AzkarWodoaa azkarWodoaa = new AzkarWodoaa("أذكار الصباح والمساء","24دعاء","إضافة للمفضلة",R.drawable.like_grey);
        AzkarWodoaa azkarWodoaa2 = new AzkarWodoaa("أذكار الصباح والمساء","24دعاء","إضافة للمفضلة",R.drawable.like_purple);
        AzkarWodoaa azkarWodoaa3 = new AzkarWodoaa("أذكار الصباح والمساء","24دعاء","إضافة للمفضلة",R.drawable.like_purple);
        AzkarWodoaa azkarWodoaa4 = new AzkarWodoaa("أذكار الصباح والمساء","24دعاء","إضافة للمفضلة",R.drawable.like_purple);

        arrayList = new ArrayList<>();
        arrayList.add(azkarWodoaa);
        arrayList.add(azkarWodoaa2);
        arrayList.add(azkarWodoaa3);
        arrayList.add(azkarWodoaa4);

        azkarWodoaaAdapter = new AzkarWodoaaAdapter(arrayList,this);
        recyclerView2.setAdapter(azkarWodoaaAdapter);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(this));

        toolbarAzkarWodoaa=findViewById(R.id.toolbar_azkar_wodoaa);
        setSupportActionBar(toolbarAzkarWodoaa);
        getSupportActionBar().setTitle("");
        toolbarAzkarWodoaa.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

}
