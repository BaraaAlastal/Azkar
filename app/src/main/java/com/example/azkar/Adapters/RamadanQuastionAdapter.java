package com.example.azkar.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.example.azkar.Models.RamadanQuastion;
import com.example.azkar.R;

import java.util.ArrayList;

public class RamadanQuastionAdapter extends RecyclerView.Adapter<RamadanQuastionAdapter.RamadanViewHolder> {

    private ArrayList<RamadanQuastion> list;
    private Context context;

    public RamadanQuastionAdapter(ArrayList<RamadanQuastion> list,Context context) {
        this.list=list;
        this.context=context;
    }

    @NonNull
    @Override
    public RamadanQuastionAdapter.RamadanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ramadan_questions_item,parent,false);
        return new RamadanQuastionAdapter.RamadanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RamadanQuastionAdapter.RamadanViewHolder holder, int position) {
        RamadanQuastion ramadanQuastion = list.get(position);
        holder.tv_qus.setText(ramadanQuastion.getQuastion());
        holder.tv_ans.setText(ramadanQuastion.getAnswer());

        holder.tv_qus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(view.getVisibility()== view.VISIBLE){
                    holder.tv_ans.setVisibility(View.VISIBLE);
                    holder.tv_qus.setTextColor(ContextCompat.getColor(context,R.color.purple));
                }
                else {
                    holder.tv_ans.setVisibility(View.GONE);
                    holder.tv_qus.setTextColor(ContextCompat.getColor(context,R.color.blue));
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class RamadanViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView tv_qus,tv_ans;
        public RamadanViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_qus=itemView.findViewById(R.id.tv_ramadan_quastion);
            tv_ans=itemView.findViewById(R.id.tv_ramadan_answer);

            tv_ans.setVisibility(View.GONE);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            tv_ans.setVisibility(view.GONE);
            tv_qus.getResources().getColor(R.color.blue);
        }
    }
}
