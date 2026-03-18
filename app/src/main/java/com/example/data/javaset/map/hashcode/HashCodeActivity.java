package com.example.data.javaset.map.hashcode;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.data.R;

import java.util.HashMap;
import java.util.Map;

/**
 * HashCode
 * 深入理解Object中的hashCode()
 * https://blog.csdn.net/weixin_46215617/article/details/119611129?spm=1001.2014.3001.5501
 */
public class HashCodeActivity extends AppCompatActivity {

    private TextView tvDes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hash_code);
        tvDes = findViewById(R.id.tv_des);
        tvDes.setText("测试HashCode");
    }

    /**
     * Map遍历
     * @param v
     */
    public void onTest1(View v) {
        HashMap<Person, Integer> map = new HashMap<>();
        //key:Person类型  value:Integer类型
        map.put(new Person("1","张三"),100);
        System.out.println("==================> " + map.get(new Person("1", "张三")));
    }

    /**
     * Map遍历
     * @param v
     */
    public void onTest2(View v) {

    }

    public void onTest3(View v) {

    }

}