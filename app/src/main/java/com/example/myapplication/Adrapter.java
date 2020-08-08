package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Adrapter extends RecyclerView.Adapter<Adrapter.ViewHolder> {
    List<contect> LisContects = new ArrayList<>();

    public Adrapter(List<contect> lisContects) {
        LisContects = lisContects;
    }

    @NonNull
    @Override
    public Adrapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adrapter.ViewHolder holder, int position) {
        contect contect = LisContects.get(position);
        String name = LisContects.get(position).getName();
        String sdt = LisContects.get(position).getSdt();
        holder.tvName.setText(name);
        holder.tvSdt.setText(sdt);
    }

    @Override
    public int getItemCount() {
        return LisContects.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName, tvSdt;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvSdt = itemView.findViewById(R.id.tvSdt);
        }
    }
}
