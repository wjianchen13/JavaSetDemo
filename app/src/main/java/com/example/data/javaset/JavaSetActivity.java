package com.example.data.javaset;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.data.R;
import com.example.data.javaset.comparator.ComparatorActivity;
import com.example.data.javaset.iterator.IteratorActivity;
import com.example.data.javaset.list.ArrayListActivity;
import com.example.data.javaset.list.LinkedListActivity;
import com.example.data.javaset.list.StackActivity;
import com.example.data.javaset.list.VectorActivity;
import com.example.data.javaset.map.HashMapActivity;
import com.example.data.javaset.map.LinkedHashMapActivity;
import com.example.data.javaset.map.TreeMapActivity;
import com.example.data.javaset.safetest.SafeTestActivity;
import com.example.data.javaset.set.HashSetActivity;
import com.example.data.javaset.set.LinkedHashSetActivity;
import com.example.data.javaset.set.TreeSetActivity;

public class JavaSetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_set);
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

    /**
     * Comparator 比较器测试
     * @param v
     */
    public void onComparator(View v) {
        startActivity(new Intent(this, ComparatorActivity.class));
    }

}