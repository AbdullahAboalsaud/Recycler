package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerUser extends RecyclerView.Adapter<AdapterRecyclerUser.Holder> {

    ArrayList<String>list;

    public void setList(ArrayList<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.textUser.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list!=null? list.size():0;
    }

    class Holder extends RecyclerView.ViewHolder {

        ImageView imageUser;
        TextView textUser;
        public Holder(@NonNull View itemView) {
            super(itemView);
            imageUser = itemView.findViewById(R.id.image_user);
            textUser = itemView.findViewById(R.id.text_name);
        }
    }
}
