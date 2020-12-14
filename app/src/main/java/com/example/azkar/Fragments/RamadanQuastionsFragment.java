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

import com.example.azkar.Adapters.RamadanQuastionAdapter;
import com.example.azkar.Models.RamadanQuastion;
import com.example.azkar.PrayerTimingsActivity;
import com.example.azkar.R;

import java.util.ArrayList;

public class RamadanQuastionsFragment extends Fragment {

    private ImageView mosque_img;
    private RecyclerView recyclerView;
    private ArrayList<RamadanQuastion> arrayList;
    private RamadanQuastionAdapter adapter;

    public RamadanQuastionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ramadan_quastions, container, false);
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

        recyclerView=view.findViewById(R.id.recycler_ramadan_quastion);
        arrayList=new ArrayList<>();
        arrayList.add(new RamadanQuastion(getString(R.string.tv_ramadan_question),getString(R.string.tv_ramadan_answer)));
        arrayList.add(new RamadanQuastion(getString(R.string.tv_ramadan_question2),getString(R.string.tv_ramadan_answer)));
        arrayList.add(new RamadanQuastion(getString(R.string.tv_ramadan_question3),getString(R.string.tv_ramadan_answer)));
        arrayList.add(new RamadanQuastion(getString(R.string.tv_ramadan_question4),getString(R.string.tv_ramadan_answer)));
        arrayList.add(new RamadanQuastion(getString(R.string.tv_ramadan_question2),getString(R.string.tv_ramadan_answer)));

        adapter=new RamadanQuastionAdapter(arrayList,view.getContext());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext()));
        recyclerView.setHasFixedSize(true);
    }

}
