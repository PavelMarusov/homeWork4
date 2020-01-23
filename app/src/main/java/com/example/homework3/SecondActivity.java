package com.example.homework3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {
    EditText editText;
    Button saveName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("pop", "message");
        Intent intent = getIntent();
        editText = findViewById(R.id.SA_edit_text);
        saveName = findViewById(R.id.SA_button_save);

        saveName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent();
                intent1.putExtra("key", editText.getText().toString());
                Log.d("pop", "SA onClick");
                setResult(RESULT_OK,intent1);
                finish();
            }
        });


    }
}
