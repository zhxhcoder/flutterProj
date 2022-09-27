package com.zhxh.base;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class BaseMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}