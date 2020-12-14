package com.example.azkar.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;

import com.example.azkar.Adapters.AzkarListApapter;
import com.example.azkar.Models.AzkarList;
import com.example.azkar.PrayerTimingsActivity;
import com.example.azkar.R;

import java.util.ArrayList;


public class AzkarListFragment extends Fragment {

    ImageView search_img,mosque_img;

    private RecyclerView recyclerView;
    private ArrayList<AzkarList> azkarLists;
    private AzkarListApapter adapter;
    public AzkarListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_azkar_list, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView=view.findViewById(R.id.recyclerView);
        mosque_img=view.findViewById(R.id.mosque_icon);
        mosque_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 =new Intent(view.getContext(), PrayerTimingsActivity.class);
                startActivity(intent1);
            }
        });

        azkarLists=new ArrayList<>();
        AzkarList azkarList = new AzkarList("أذكار الوضوء والصلاة","10أذكار",R.drawable.salah_icon);
        AzkarList azkarList2 = new AzkarList("أدعية الطعام والصيام","10أذكار",R.drawable.food_icon);
        AzkarList azkarList3 = new AzkarList("أدعية الحج والعمرة","15ذكر",R.drawable.adeiat_hage);
        AzkarList azkarList4 = new AzkarList("أذكار الملابس","15ذكر",R.drawable.clothes_icon);
        AzkarList azkarList5 = new AzkarList("أدعية المعاملات","4أذكار",R.drawable.shopping_icon);
        AzkarList azkarList6 = new AzkarList("أدعية المرض والضيق والحزن","18ذكر",R.drawable.illness_icon);
        AzkarList azkarList7 = new AzkarList("أدعية الولادة والوفاة","4أذكار",R.drawable.baby_icon);
        AzkarList azkarList8= new AzkarList("أدعية الطقس","4أذكار",R.drawable.weather_icon);
        AzkarList azkarList9= new AzkarList("أدعية الزواج والأولاد","15ذكر",R.drawable.married_icon);
        AzkarList azkarList10= new AzkarList("أدعية السفر والسوق","12ذكر",R.drawable.travel_icon);
        AzkarList azkarList11= new AzkarList("أذكار إيمانية","3أذكار",R.drawable.quran_icon);
        AzkarList azkarList12= new AzkarList("أدعية حول الحيوانات","18ذكر",R.drawable.animal_icon);

        azkarLists.add(azkarList);
        azkarLists.add(azkarList2);
        azkarLists.add(azkarList3);
        azkarLists.add(azkarList4);
        azkarLists.add(azkarList5);
        azkarLists.add(azkarList6);
        azkarLists.add(azkarList7);
        azkarLists.add(azkarList8);
        azkarLists.add(azkarList9);
        azkarLists.add(azkarList10);
        azkarLists.add(azkarList11);
        azkarLists.add(azkarList12);

        adapter= new AzkarListApapter(azkarLists,view.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));

    }
}
