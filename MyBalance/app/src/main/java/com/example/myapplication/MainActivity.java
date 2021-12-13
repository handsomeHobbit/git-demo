package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout mTab1;
    private LinearLayout mTab2;
    private LinearLayout frameLayout_home;
    private LinearLayout frameLayout_my;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //去掉标题栏
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }

        mTab1 = findViewById(R.id.id_tab1);
        mTab2 = findViewById(R.id.id_tab2);
        frameLayout_home = findViewById(R.id.fragment_home);
        frameLayout_my = findViewById(R.id.fragment_my);
        mTab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameLayout_home.setVisibility(View.VISIBLE);
                frameLayout_my.setVisibility(View.INVISIBLE);
            }
        });
        mTab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameLayout_my.setVisibility(View.VISIBLE);
                frameLayout_home.setVisibility(View.INVISIBLE);
            }
        });

    }


}


