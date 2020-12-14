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
import android.widget.ImageView;

import com.example.azkar.Adapters.AzkarWodoaaAdapter;
import com.example.azkar.Models.AzkarWodoaa;
import com.example.azkar.PrayerTimingsActivity;
import com.example.azkar.R;

import java.util.ArrayList;


public class FavouriteFragment extends Fragment {

    private ImageView mosque_img;
    private ArrayList<AzkarWodoaa>arrayList;
    private RecyclerView recyclerView;
    private AzkarWodoaaAdapter adapter;

    public FavouriteFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favourite, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mosque_img=view.findViewById(R.id.mosque_icon);
        mosque_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 =new Intent(view.getContext(), PrayerTimingsActivity.class);
                startActivity(intent1);
            }
        });

        recyclerView=view.findViewById(R.id.recycler_favourite_fragment);

        AzkarWodoaa azkarWodoaa = new AzkarWodoaa("أذكار الصباح والمساء","24دعاء","إزالة من المفضلة",R.drawable.like_purple);
        AzkarWodoaa azkarWodoaa2 = new AzkarWodoaa("أذكار الصباح والمساء","24دعاء","إزالة من المفضلة",R.drawable.like_purple);
        AzkarWodoaa azkarWodoaa3 = new AzkarWodoaa("أذكار الصباح والمساء","24دعاء","إزالة من المفضلة",R.drawable.like_purple);
        AzkarWodoaa azkarWodoaa4 = new AzkarWodoaa("أذكار الصباح والمساء","24دعاء","إزالة من المفضلة",R.drawable.like_purple);

        arrayList = new ArrayList<>();
        arrayList.add(azkarWodoaa);
        arrayList.add(azkarWodoaa2);
        arrayList.add(azkarWodoaa3);
        arrayList.add(azkarWodoaa4);

        adapter = new AzkarWodoaaAdapter(arrayList,view.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
    }


}
