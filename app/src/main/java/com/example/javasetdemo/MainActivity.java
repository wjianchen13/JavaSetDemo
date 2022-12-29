package com.example.javasetdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.javasetdemo.iterator.IteratorActivity;
import com.example.javasetdemo.list.ArrayListActivity;
import com.example.javasetdemo.list.LinkedListActivity;
import com.example.javasetdemo.list.StackActivity;
import com.example.javasetdemo.list.VectorActivity;
import com.example.javasetdemo.map.HashMapActivity;
import com.example.javasetdemo.map.LinkedHashMapActivity;
import com.example.javasetdemo.map.TreeMapActivity;
import com.example.javasetdemo.safetest.SafeTestActivity;
import com.example.javasetdemo.set.HashSetActivity;
import com.example.javasetdemo.set.LinkedHashSetActivity;
import com.example.javasetdemo.set.TreeSetActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * 测试集合是否线程安全
     * @param v
     */
    public void onSafe(View v) {
        startActivity(new Intent(this, SafeTestActivity.class));
    }

    /**
     * ArrayList
     * @param v
     */
    public void onArrayList(View v) {
        startActivity(new Intent(this, ArrayListActivity.class));
    }

    /**
     * LinkedList
     * @param v
     */
    public void onLinkedList(View v) {
        startActivity(new Intent(this, LinkedListActivity.class));
    }

    /**
     * Vector
     * @param v
     */
    public void onVector(View v) {
        startActivity(new Intent(this, VectorActivity.class));
    }

    /**
     * Stack
     * @param v
     */
    public void onStack(View v) {
        startActivity(new Intent(this, StackActivity.class));
    }

    /**
     * HashSet
     * @param v
     */
    public void onHashSet(View v) {
        startActivity(new Intent(this, HashSetActivity.class));
    }

    /**
     * LinkedHashSet
     * @param v
     */
    public void onLinkedHashSet(View v) {
        startActivity(new Intent(this, LinkedHashSetActivity.class));
    }

    /**
     * TreeSet
     * @param v
     */
    public void onTreeSet(View v) {
        startActivity(new Intent(this, TreeSetActivity.class));
    }

    /**
     * HashMap
     * @param v
     */
    public void onHashMap(View v) {
        startActivity(new Intent(this, HashMapActivity.class));
    }

    /**
     * LinkedHashMap
     * @param v
     */
    public void onLinkedHashMap(View v) {
        startActivity(new Intent(this, LinkedHashMapActivity.class));
    }

    /**
     * TreeMap
     * @param v
     */
    public void onTreeMap(View v) {
        startActivity(new Intent(this, TreeMapActivity.class));
    }

    /**
     * Iterator 迭代器测试
     * @param v
     */
    public void onIterator(View v) {
        startActivity(new Intent(this, IteratorActivity.class));
    }
}