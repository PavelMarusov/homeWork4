package com.example.homework3;

import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
public class HolderView extends RecyclerView.ViewHolder {
    TextView textView;
    newOnClick newOnClick;
    public HolderView(@NonNull final View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.HV_text_view);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                newOnClick.onClick(textView.getText().toString());
                Log.d("pop",textView.getText().toString());
            }
        });

    }
    public void setText (String text){
        textView.setText(text);
    }
}
