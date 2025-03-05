package com.example.data.javaset.map.hash;

import static com.example.data.javaset.Utils.log;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.data.R;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 哈希值测试
 */
public class TestHashActivity1 extends AppCompatActivity {

    private TextView tvDes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_hash);
        tvDes = findViewById(R.id.tv_des);
        tvDes.setText("测试HashMap");
    }

    /**
     * Map遍历
     * @param v
     */
    public void onTest1(View v) {
        HashMap<Person, Integer> map = new HashMap<>();
        //key:Person类型  value:Integer类型
        map.put(new Person("1","张三"),100);
        System.out.println(map.get(new Person("1", "张三")));
    }




}