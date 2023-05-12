package com.example.data;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.data.javaset.JavaSetActivity;
import com.example.data.xiangxue.XiangXueActivity;
import com.example.data.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * java集合框架
     * @param v
     */
    public void onTest1(View v) {
        startActivity(new Intent(this, JavaSetActivity.class));
    }

    /**
     * 享学课堂
     * @param v
     */
    public void onTest2(View v) {
        startActivity(new Intent(this, XiangXueActivity.class));
    }
    
}