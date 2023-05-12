package com.example.data.xiangxue;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.data.R;
import com.example.data.javaset.safetest.SafeTestActivity;
import com.example.data.xiangxue.tree.TreeActivity;

public class XiangXueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xiangxue);
    }

    /**
     * 树
     * @param v
     */
    public void onTree(View v) {
        startActivity(new Intent(this, TreeActivity.class));
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

    /**
     * 
     * @param v
     */
    public void onVector(View v) {

    }

    /**
     * 
     * @param v
     */
    public void onStack(View v) {

    }

    /**
     * 
     * @param v
     */
    public void onHashSet(View v) {

    }

    /**
     * 
     * @param v
     */
    public void onLinkedHashSet(View v) {
    }

    /**
     * 
     * @param v
     */
    public void onTreeSet(View v) {

    }

    /**
     * 
     * @param v
     */
    public void onHashMap(View v) {

    }

    /**
     * 
     * @param v
     */
    public void onLinkedHashMap(View v) {

    }

    /**
     * 
     * @param v
     */
    public void onTreeMap(View v) {

    }

    /**
     *  
     * @param v
     */
    public void onIterator(View v) {

    }

    /**
     *  
     * @param v
     */
    public void onComparator(View v) {

    }

}