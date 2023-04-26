package com.example.data.javaset.list;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.data.javaset.Utils;
import com.example.data.R;

import java.util.Vector;
import java.util.List;
import java.util.ListIterator;

/**
 * Vector 相关使用方法
 */
public class VectorActivity extends AppCompatActivity {

    private TextView tvDes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arraylist);
        tvDes = findViewById(R.id.tv_des);
        tvDes.setText("测试Vector");
    }

    /**
     * add()
     * @param v
     */
    public void onAdd(View v) {
        List<String> mList = new Vector<>();
        mList.add("test1");
        Utils.log("add(): " + mList);
    }

    /**
     * addAll()
     * @param v
     */
    public void onAddAll(View v) {
        List<String> tList = new Vector<>();
        tList.add("test1");
        tList.add("test2");
        List<String> mList = new Vector<>();
        mList.addAll(tList);
        Utils.log("addAll(): " + mList);
    }

    /**
     * clear()
     * @param v
     */
    public void onClear(View v) {
        List<String> mList = new Vector<>();
        mList.add("test1");
        Utils.log("clear(): " + mList);
        mList.clear();
        Utils.log("clear(): " + mList);
    }

    /**
     * contains()
     * @param v
     */
    public void onContains(View v) {
        List<String> tList = new Vector<>();
        tList.add("test1");
        tList.add("test2");
        Utils.log("contains(): " + tList.contains("test2"));
    }

    /**
     * containsAll()
     * @param v
     */
    public void onContainsAll(View v) {
        List<String> mList = new Vector<>();
        mList.add("test1");
        mList.add("test2");
        mList.add("test3");
        List<String> tList = new Vector<>();
        tList.add("test1");
        tList.add("test2");
        Utils.log("containsAll(): " + mList.contains(tList));
    }

    /**
     * isEmpty()
     * @param v
     */
    public void onIsEmpty(View v) {
        List<String> mList = new Vector<>();
        Utils.log("isEmpty(): " + mList.isEmpty());
        mList.add("test1");
        Utils.log("isEmpty(): " + mList.isEmpty());
    }

    /**
     * Iterator()
     * @param v
     */
    public void onIterator(View v) {
        List<String> mList = new Vector<>();
        //添加集合元素
        mList.add("鸡");
        mList.add("你");
        mList.add("美");

        //建立List迭代器(ListIterator)
        ListIterator<String> lit = mList.listIterator();

//        E next(); 返回迭代中的下一个元素
//        boolean hasNext(); 判断是否有下一个元素,有则返回true,无则false
        while(lit.hasNext()){
            String ss = lit.next();
            if (ss.equals("你")){
                //void add(E e); 将指定的元素插入列表(注意是lit调用add方法哦,是往！集合!中添加)
                lit.add("太");
            }
            Utils.log(ss); // 用迭代器内部输出是没有添加"太"元素的
        }
        Utils.log(mList + "");

//        E previous(); 返回迭代器中的上一个元素
//        boolean hasPrevious(); 判断是否有上一个元素,有则返回true,无则false
        while (lit.hasPrevious()){//逆向索引(从后往前)
            String sss = lit.previous();
            if (sss.equals("鸡")){
//                void remove();从列表中删除由 next()或 previous()返回的最后一个元素（可选操作）
                lit.remove();
            }
            Utils.log(sss); // 用迭代器内部输出是没有删除"鸡"元素的
        }
        Utils.log(mList + "");
    }

    /**
     * remove()
     * @param v
     */
    public void onRemove(View v) {
        List<String> mList = new Vector<>();
        mList.add("test1");
        mList.add("test2");
        mList.add("test3");
        Utils.log("remove(): " + mList);
        mList.remove(0);
        Utils.log("remove(): " + mList);
        mList.remove("test3");
        Utils.log("remove(): " + mList);
    }

    /**
     * removeAll()
     * @param v
     */
    public void onRemoveAll(View v) {
        List<String> mList = new Vector<>();
        mList.add("test1");
        mList.add("test2");
        mList.add("test3");
        Utils.log("removeAll(): " + mList);
        List<String> tList = new Vector<>();
        tList.add("test1");
        tList.add("test2");
        mList.removeAll(tList);
        Utils.log("removeAll(): " + mList);
    }

    /**
     * retainAll()
     * @param v
     */
    public void onRetainAll(View v) {
        List<String> mList = new Vector<>();
        mList.add("test1");
        mList.add("test2");
        mList.add("test3");
        List<String> tList = new Vector<>();
        tList.add("test1");
        tList.add("test2");
        Utils.log("onRetainAll() mList: " + mList);
        Utils.log("onRetainAll() tList: " + tList);
        mList.retainAll(tList);
        Utils.log("onRetainAll() mList1: " + mList);
        Utils.log("onRetainAll() tList2: " + tList);
    }

    /**
     * size()
     * @param v
     */
    public void onSize(View v) {
        List<String> mList = new Vector<>();
        mList.add("test1");
        mList.add("test2");
        mList.add("test3");
        Utils.log("size() mList size: " + mList.size());
    }

    /**
     * toArray()
     * @param v
     */
    public void onToArray(View v) {
        List<String> mList = new Vector<>();
        mList.add("test1");
        mList.add("test2");
        mList.add("test3");

//        String[] ts = (String[])mList.toArray(); // 报错：ClassCastException: java.lang.Object[] cannot be cast to java.lang.String[]

        String[] ts = new String[mList.size()];
        mList.toArray(ts);
        for(int i = 0; i < ts.length; i ++) {
            Utils.log("ts[" + i + "]:" + ts[i]);
        }
    }

    /**
     * get()
     * @param v
     */
    public void onGet(View v) {
        List<String> mList = new Vector<>();
        mList.add("test1");
        mList.add("test2");
        mList.add("test3");
        Utils.log("get(0):" + mList.get(0));
        Utils.log("get(1):" + mList.get(1));
    }

    /**
     * indexOf()
     * @param v
     */
    public void onIndex(View v) {
        List<String> mList = new Vector<>();
        mList.add("test1");
        mList.add("test2");
        mList.add("test3");
        Utils.log("index(1):" + mList.indexOf(1));
    }

    /**
     * lastIndexOf()
     * @param v
     */
    public void onLastIndexOf(View v) {
        List<String> mList = new Vector<>();
        mList.add("test1");
        mList.add("test2");
        mList.add("test3");
        Utils.log("lastIndexOf(0):" + mList.lastIndexOf(0));

    }

    /**
     * set()
     * @param v
     */
    public void onSet(View v) {
        List<String> mList = new Vector<>();
        mList.add("test1");
        mList.add("test2");
        mList.add("test3");
        Utils.log("get(0):" + mList.get(0));
        mList.set(0, "test0");
        Utils.log("get(0):" + mList.get(0));
    }

    /**
     * subList()
     * @param v
     */
    public void onSubList(View v) {
        List<String> mList = new Vector<>();
        mList.add("test1");
        mList.add("test2");
        mList.add("test3");
        List<String> tList = mList.subList(0, 2);
        Utils.log("subList():" + tList);
    }



}