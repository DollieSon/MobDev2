package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LL2 extends AppCompatActivity {

    public Button Insta;
    public Button BtnAct;
    public Button CalcAct;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitylayout2);

        Insta = (Button) findViewById(R.id.InstagramBtn);
        BtnAct = (Button) findViewById(R.id.BtnActBtn);
        CalcAct = (Button) findViewById(R.id.CalcBtn);

        System.out.println("ButtonACT:" + BtnAct);
        BtnAct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ButtonAct.class);
                startActivity(intent);
            }
        });
        Insta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }



}