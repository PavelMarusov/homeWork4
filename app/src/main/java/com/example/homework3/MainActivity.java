package com.example.homework3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements newOnClick {
    RecyclerView recyclerView;
    Button addStudens;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);
        AdapterActivity adapterActivity = new AdapterActivity();
        adapterActivity.newOnClick = this;
        recyclerView.setAdapter(adapterActivity);
        addStudens = findViewById(R.id.AM_add_button);
        addStudens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivityForResult(intent, 11);
            }

        });


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 11 && resultCode == RESULT_OK) {
            String str = data.getStringExtra("key");
        Log.d("pop",str);
            AdapterActivity adapterActivity = new AdapterActivity();
            adapterActivity.addText(str);
            recyclerView.setAdapter(adapterActivity);
        }
    }


    @Override
    public void onClick(String str) {
        Intent intent = new Intent(MainActivity.this,ThreeActivity.class);
        startActivity(intent);
    }
}
