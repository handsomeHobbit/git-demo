package com.example.myapplication;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout mTab1;
    private LinearLayout mTab2;
    private FragmentManager fm = null;
    private FragmentTransaction transaction = null;
    private HomeFragment homeFragment;
    private MyFragment myFragment;
    private ImageView home_img;
    private ImageView my_img;

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
        home_img = findViewById(R.id.img_home);
        my_img = findViewById(R.id.img_my);
        fm = getSupportFragmentManager();
        setDefaultFragment();
        mTab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home_img.setImageResource(R.drawable.home_green);
                my_img.setImageResource(R.drawable.my);
                transaction = fm.beginTransaction();
                homeFragment = new HomeFragment();
                transaction.replace(R.id.fragment_container, homeFragment);
                transaction.commit();
            }
        });
        mTab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                home_img.setImageResource(R.drawable.home2);
                my_img.setImageResource(R.drawable.my_green);
                transaction = fm.beginTransaction();
                myFragment = new MyFragment();
                transaction.replace(R.id.fragment_container, myFragment);
                transaction.commit();
            }
        });

    }

    private void setDefaultFragment() {
        transaction = fm.beginTransaction();
        homeFragment = new HomeFragment();
        transaction.replace(R.id.fragment_container, homeFragment);
        transaction.commit();
    }


}


