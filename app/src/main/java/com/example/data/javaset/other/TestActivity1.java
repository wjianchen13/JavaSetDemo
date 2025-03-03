package com.example.data.javaset.other;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.data.R;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * HashMap 相关使用方法
 * https://blog.csdn.net/zy103118/article/details/119903994
 */
public class TestActivity1 extends AppCompatActivity {

    private TextView tvDes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
        tvDes = findViewById(R.id.tv_des);
        tvDes.setText("测试HashMap");
    }

    /**
     * add()
     * @param v
     */
    public void onAdd(View v) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue();
        queue.add("哈哈哈");
        System.out.println("offer后，队列是否空？" + queue.isEmpty());
        System.out.println("从队列中poll：" + queue.poll());
        System.out.println("pool后，队列是否空？" + queue.isEmpty());
    }

    /**
     * contains
     * @param v
     */
    public void onContains(View v) {

    }

    /**
     * isEmpty
     * @param v
     */
    public void isEmpty(View v) {

    }

    /**
     * 遍历
     * @param v
     */
    public void onIterator(View v) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<String>();
        queue.offer("123");
        queue.offer("234");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    /**
     * offer()
     * @param v
     */
    public void onOffer(View v) {

    }

    /**
     * peek()
     * @param v
     */
    public void onPeek(View v) {

    }

    /**
     * poll()
     * @param v
     */
    public void onPoll(View v) {

    }

    /**
     * remove()
     * @param v
     */
    public void onRemove(View v) {

    }

    /**
     * size()
     * @param v
     */
    public void onSize(View v) {

    }

    /**
     * toArray()
     * @param v
     */
    public void onToArray(View v) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<String>();
        queue.offer("123");
        queue.offer("234");
        Object[] objects = queue.toArray();
        System.out.println(objects[0] + ", " + objects[1]);
        // 将数据存储到指定数组
        String[] strs = new String[2];
        queue.toArray(strs);
        System.out.println(strs[0] + ", " + strs[1]);
    }

    /**
     * 测试
     * @param v
     */
    public void onTest(View v) {
        ConcurrentLinkedQueue<String> queue = new ConcurrentLinkedQueue<String>();
        queue.offer("1");
        queue.offer("2");
        queue.offer("3");
        queue.offer("4");
        queue.offer("5");
        queue.offer("6");
        System.out.println("=======================> 开始前：" + queue);
        Iterator<String> iterator = queue.iterator();
        List<String> list = new ArrayList<>();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
            list.add(str);
        }
        queue.clear();
        System.out.println("=======================> 开始后：" + queue);
        System.out.println("=======================> 开始后：" + list);
    }

}