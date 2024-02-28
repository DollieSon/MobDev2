package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ButtonAct extends AppCompatActivity {
    Button CloseBtn;
    Button ToastBtn;
    Button ChangeBGbtn;
    Button DisappearBtn;
    Button ButtonChangeBgBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        CloseBtn = findViewById(R.id.CloseBtn);
        CloseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),ReturningBack.class);
                startActivity(intent);
            }
        });
        ToastBtn = findViewById(R.id.ToastBtn);
        ToastBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ToastBtnFnc();
            }
        });


        ChangeBGbtn = findViewById(R.id.ChangeBGbtn);
        ChangeBGbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ChangeBGbtnFnc();
            }
        });

        DisappearBtn = findViewById(R.id.DisappearBtn);
        DisappearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DisappearFnc();
            }
        });
        ButtonChangeBgBtn = findViewById(R.id.ChangeButtonBgBtn);
        ButtonChangeBgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BCBFnc();
            }
        });
    }

    private void CloseBtnFnc(){
        finish();
        return;
    }
    private void ToastBtnFnc(){
        int dur = Toast.LENGTH_SHORT;
        String message = "Let's Toast";
        Toast.makeText(this,message,dur).show();
        return;
    }
    private void ChangeBGbtnFnc(){
        int bg1 = 0x2C2321;
        int bg2 = 0x37C8BB;
        int bg3 = 0x21AF41;
        this.getWindow().getDecorView().setBackgroundColor(Color.argb(255,156, 55, 48));
        return;
    }
    private void DisappearFnc(){
        DisappearBtn.setVisibility(View.GONE);
        DisappearBtn.postDelayed(new Runnable(){
            @Override
            public void run()
            {
                DisappearBtn.setVisibility(View.VISIBLE);
            }
        }, 5000);
        return;
    }
    private void BCBFnc(){
        ButtonChangeBgBtn.setBackgroundColor(Color.argb(255,156, 55, 48));
        return;
    }
}