package com.example.mybalance;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {
    private Button mBtnRegister;
    private TextView mTxtReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        ActionBar actionBar = getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
        mBtnRegister = findViewById(R.id.btn_register);
        mBtnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(com.example.mybalance.RegisterActivity.this, com.example.mybalance.LoginActivity.class);
                startActivity(intent);
            }
        });

        mTxtReturn = findViewById(R.id.txt_return);
        mTxtReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = null;
                intent = new Intent(com.example.mybalance.RegisterActivity.this, com.example.mybalance.LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
