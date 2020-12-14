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

import com.example.azkar.Models.AzkarWodoaa;
import com.example.azkar.PrayerDetailsActivity;
import com.example.azkar.R;

import java.util.ArrayList;

public class AzkarWodoaaAdapter extends RecyclerView.Adapter<AzkarWodoaaAdapter.MViewHolder> {
    private ArrayList<AzkarWodoaa> list;
    private Context context;

    public AzkarWodoaaAdapter(ArrayList<AzkarWodoaa> list,Context context) {
        this.list=list;
        this.context=context;
    }

    @NonNull
    @Override
    public AzkarWodoaaAdapter.MViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.azkar_wodoaa_list_item,parent,false);
        return new AzkarWodoaaAdapter.MViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final AzkarWodoaaAdapter.MViewHolder holder, int position) {
        AzkarWodoaa azkarWodoaa = list.get(position);
        holder.tv_doaa_name.setText(azkarWodoaa.getDoaaName());
        holder.tv_numOfDoaa.setText(azkarWodoaa.getNumOfDoaa());
        holder.tv_add2Fav.setText(azkarWodoaa.getAdd2Favourite());
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.isClickable()){
                    if (view.getResources().getDrawable(R.drawable.like_grey).isVisible()){
                        view.setBackgroundResource(R.drawable.like_purple);
                        holder.tv_add2Fav.setText("ازالة من المفضلة");
                    }
                    else if(view.getResources().getDrawable(R.drawable.like_purple).isVisible()) {
                        view.setBackgroundResource(R.drawable.like_grey);
                        holder.tv_add2Fav.setText("اضافة للمفضلة");
                    }
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tv_doaa_name,tv_numOfDoaa,tv_add2Fav;
        ImageView image;
        public MViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_doaa_name=itemView.findViewById(R.id.tv_zeker_name);
            tv_numOfDoaa=itemView.findViewById(R.id.tv_numOfDoaa);
            tv_add2Fav=itemView.findViewById(R.id.tv_add_to_favourite);
            image=itemView.findViewById(R.id.favourite_icon);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, PrayerDetailsActivity.class);
            context.startActivity(intent);
        }
    }
}
