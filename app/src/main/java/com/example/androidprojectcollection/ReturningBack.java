package com.example.androidprojectcollection;

import static com.example.androidprojectcollection.R.*;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ReturningBack extends AppCompatActivity {

    Button BtnRet;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_returning_back);
        BtnRet = findViewById(id.ReturnBackGod);
        BtnRet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}