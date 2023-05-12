package com.example.data.xiangxue.tree;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.data.xiangxue.tree.rb.RBTreeActivity;
import com.example.data.R;

public class TreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree);
    }

    /**
     * 红黑树
     * @param v
     */
    public void onTest1(View v) {
        startActivity(new Intent(this, RBTreeActivity.class));
    }

    /**
     * 
     * @param v
     */
    public void onArrayList(View v) {

    }

    /**
     * 
     * @param v
     */
    public void onLinkedList(View v) {

    }

}