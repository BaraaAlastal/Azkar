package com.example.azkar.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.azkar.AzkarWodoaaActivity;
import com.example.azkar.Models.AzkarList;
import com.example.azkar.R;

import java.util.ArrayList;

public class AzkarListApapter extends RecyclerView.Adapter<AzkarListApapter.MyViewHolder> {
    private ArrayList<AzkarList> list;
    private Context context;

    public AzkarListApapter(ArrayList<AzkarList> list,Context context) {
        this.list=list;
        this.context=context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.azkar_list_item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        AzkarList azkarList = list.get(position);
        holder.tv_title.setText(azkarList.getTitle());
        holder.tv_numOfAzkar.setText(azkarList.getNumOfAzkar());
        holder.imageView.setImageResource(azkarList.getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tv_title,tv_numOfAzkar;
        ImageView imageView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_title=itemView.findViewById(R.id.tv_title);
            tv_numOfAzkar=itemView.findViewById(R.id.tv_numOfAzkar);
            imageView=itemView.findViewById(R.id.imageView_list_item);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, AzkarWodoaaActivity.class);
            context.startActivity(intent);
        }
    }
}
