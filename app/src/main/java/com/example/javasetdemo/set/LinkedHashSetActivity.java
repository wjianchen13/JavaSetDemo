package com.example.javasetdemo.set;

import static com.example.javasetdemo.Utils.log;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javasetdemo.R;

import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * LinkedHashSet 相关使用方法
 */
public class LinkedHashSetActivity extends AppCompatActivity {

    private TextView tvDes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hashset);
        tvDes = findViewById(R.id.tv_des);
        tvDes.setText("测试LinkedHashSet");
    }

    /**
     * add()
     * @param v
     */
    public void onAdd(View v) {
        Set<String> set = new LinkedHashSet<>();
        set.add("test3");
        set.add("test1");
        set.add("test2");
        set.add("test4");
        log("add(): " + set);
    }

    /**
     * addAll()
     * @param v
     */
    public void onAddAll(View v) {
        Set<String> tList = new LinkedHashSet<>();
        tList.add("test2");
        tList.add("test1");
        Set<String> set = new LinkedHashSet<>();
        set.addAll(tList);
        log("addAll(): " + set);
    }

    /**
     * clear()
     * @param v
     */
    public void onClear(View v) {
        Set<String> set = new LinkedHashSet<>();
        set.add("test1");
        log("clear(): " + set);
        set.clear();
        log("clear(): " + set);
    }

    /**
     * contains()
     * @param v
     */
    public void onContains(View v) {
        Set<String> tList = new LinkedHashSet<>();
        tList.add("test1");
        tList.add("test2");
        log("contains(): " + tList.contains("test2"));
    }

    /**
     * containsAll()
     * @param v
     */
    public void onContainsAll(View v) {
        Set<String> set = new LinkedHashSet<>();
        set.add("test1");
        set.add("test2");
        set.add("test3");
        Set<String> tList = new LinkedHashSet<>();
        tList.add("test1");
        tList.add("test2");
        log("containsAll(): " + set.contains(tList));
    }

    /**
     * isEmpty()
     * @param v
     */
    public void onIsEmpty(View v) {
        Set<String> set = new LinkedHashSet<>();
        log("isEmpty(): " + set.isEmpty());
        set.add("test1");
        log("isEmpty(): " + set.isEmpty());
    }

    /**
     * Iterator()
     * @param v
     */
    public void onIterator(View v) {
        Set<String> set = new LinkedHashSet<>();
        //添加集合元素
        set.add("鸡");
        set.add("你");
        set.add("太");
        set.add("美");

        //建立List迭代器(ListIterator)
        Iterator<String> lit = set.iterator();

//        E next(); 返回迭代中的下一个元素
//        boolean hasNext(); 判断是否有下一个元素,有则返回true,无则false
        while(lit.hasNext()){
            String ss = lit.next();
            log(ss); // 用迭代器内部输出是没有添加"太"元素的
        }
        log(set + "");
    }

    /**
     * remove()
     * @param v
     */
    public void onRemove(View v) {
        Set<String> set = new LinkedHashSet<>();
        set.add("test1");
        set.add("test2");
        set.add("test3");
        log("remove(): " + set);
        set.remove(0);
        log("remove(): " + set);
        set.remove("test3");
        log("remove(): " + set);
    }

    /**
     * removeAll()
     * @param v
     */
    public void onRemoveAll(View v) {
        Set<String> set = new LinkedHashSet<>();
        set.add("test1");
        set.add("test2");
        set.add("test3");
        log("removeAll(): " + set);
        Set<String> tList = new LinkedHashSet<>();
        tList.add("test1");
        tList.add("test2");
        set.removeAll(tList);
        log("removeAll(): " + set);
    }

    /**
     * retainAll()
     * @param v
     */
    public void onRetainAll(View v) {
        Set<String> set = new LinkedHashSet<>();
        set.add("test1");
        set.add("test2");
        set.add("test3");
        Set<String> tList = new LinkedHashSet<>();
        tList.add("test1");
        tList.add("test2");
        log("onRetainAll() set: " + set);
        log("onRetainAll() tList: " + tList);
        set.retainAll(tList);
        log("onRetainAll() mList1: " + set);
        log("onRetainAll() tList2: " + tList);
    }

    /**
     * size()
     * @param v
     */
    public void onSize(View v) {
        Set<String> set = new LinkedHashSet<>();
        set.add("test1");
        set.add("test2");
        set.add("test3");
        log("size() set size: " + set.size());
    }

    /**
     * toArray()
     * @param v
     */
    public void onToArray(View v) {
        Set<String> set = new LinkedHashSet<>();
        set.add("test1");
        set.add("test2");
        set.add("test3");

//        String[] ts = (String[])set.toArray(); // 报错：ClassCastException: java.lang.Object[] cannot be cast to java.lang.String[]

        String[] ts = new String[set.size()];
        set.toArray(ts);
        for(int i = 0; i < ts.length; i ++) {
            log("ts[" + i + "]:" + ts[i]);
        }
    }

}