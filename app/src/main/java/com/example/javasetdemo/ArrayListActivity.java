package com.example.javasetdemo;

import static com.example.javasetdemo.Utils.log;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList 相关使用方法
 */
public class ArrayListActivity extends AppCompatActivity {

    private List<String> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arraylist);
    }

    /**
     * add()
     * @param v
     */
    public void onAdd(View v) {
        List<String> mList = new ArrayList<>();
        mList.add("test1");
        log("add(): " + mList);
    }

    /**
     * addAll()
     * @param v
     */
    public void onAddAll(View v) {


    }

    /**
     * clear()
     * @param v
     */
    public void onClear(View v) {
        mList.add("test1");

    }

    /**
     * contains()
     * @param v
     */
    public void onContains(View v) {
        mList.add("test1");

    }

    /**
     * containsAll()
     * @param v
     */
    public void onContainsAll(View v) {
        mList.add("test1");

    }

    /**
     * isEmpty()
     * @param v
     */
    public void onIsEmpty(View v) {
        mList.add("test1");

    }

    /**
     * Iterator()
     * @param v
     */
    public void onIterator(View v) {
        mList.add("test1");

    }

    /**
     * remove()
     * @param v
     */
    public void onRemove(View v) {
        mList.add("test1");

    }

    /**
     * removeAll()
     * @param v
     */
    public void onRemoveAll(View v) {
        mList.add("test1");

    }

    /**
     * retainAll()
     * @param v
     */
    public void onRetainAll(View v) {
        mList.add("test1");

    }

    /**
     * size()
     * @param v
     */
    public void onSize(View v) {
        mList.add("test1");

    }

    /**
     * toArray()
     * @param v
     */
    public void onToArray(View v) {
        mList.add("test1");

    }

    /**
     * get()
     * @param v
     */
    public void onGet(View v) {
        mList.add("test1");

    }

    /**
     * index()
     * @param v
     */
    public void onIndex(View v) {
        mList.add("test1");

    }

    /**
     * lastIndexOf()
     * @param v
     */
    public void onLastIndexOf(View v) {
        mList.add("test1");

    }

    /**
     * set()
     * @param v
     */
    public void onSet(View v) {
        mList.add("test1");

    }

    /**
     * subList()
     * @param v
     */
    public void onSubList(View v) {
        mList.add("test1");

    }



}