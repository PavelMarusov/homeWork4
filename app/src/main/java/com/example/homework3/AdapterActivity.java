package com.example.homework3;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterActivity extends RecyclerView.Adapter<HolderView> {
    newOnClick newOnClick;
    ArrayList<String> names;
    public AdapterActivity(){
         names =  new  ArrayList<String>();
            names.add("Павел");
            names.add("Кундуз");
            names.add("Нуржамал");
            names.add("Айгерим");
            names.add("Нурсултан");
            names.add("Миркамиль");


    }


    @NonNull
    @Override
    public HolderView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.holder_view, parent, false);
        HolderView holderView = new HolderView(view);
        holderView.newOnClick = newOnClick;
        return holderView;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderView holder, int position) {
        holder.setText(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public void addText(String text) {
        names.add(text);
        Log.d("pop", "AA addtext work " + text);
        notifyDataSetChanged();
    }
}
