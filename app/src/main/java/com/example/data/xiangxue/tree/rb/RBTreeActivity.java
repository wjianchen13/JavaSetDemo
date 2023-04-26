package com.example.data.xiangxue.tree.rb;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.data.R;

/**
 * 红黑树
 */
public class RBTreeActivity extends AppCompatActivity {

    private RBTree<Integer> mRBTree;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rb_tree);
        mRBTree = new RBTree();
    }

    /**
     * 红黑树
     * @param v
     */
    public void onTest1(View v) {
        mRBTree.insert(1);
        mRBTree.print();
    }

    /**
     * 
     * @param v
     */
    public void onTest2(View v) {
        mRBTree.insert(2);
        mRBTree.print();
    }

    /**
     * 
     * @param v
     */
    public void onTest3(View v) {
        mRBTree.insert(3);
        mRBTree.print();
    }

    /**
     *
     * @param v
     */
    public void onTest4(View v) {

    }

    /**
     *
     * @param v
     */
    public void onTest5(View v) {

    }

    /**
     *
     * @param v
     */
    public void onTest6(View v) {

    }

}