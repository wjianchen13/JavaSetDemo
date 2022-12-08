package com.example.javasetdemo.safetest;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javasetdemo.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 是否线程安全测试
 */
public class SafeTestActivity extends AppCompatActivity {

    /**
     * 解决集合类线程不安全问题
     */
//    private List<String> mList = Collections.synchronizedList(new ArrayList<>());

    private List<String> mList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safe_test);
    }

    /**
     * 测试线程是否安全
     * @param v
     */
    public void onTest(View v) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10000; i ++) {
                    mList.add(i + "");
                }
            }
        };
        new Thread(runnable).start();
        new Thread(runnable).start();
    }

    /**
     * 查看mList的size
     * @param v
     */
    public void onTest1(View v) {
        System.out.println("=========================> size: " + mList.size());
    }

}