package com.example.data.javaset.comparator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.data.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Comparator 比较器
 */
public class ComparatorActivity extends AppCompatActivity {

    private TextView tvDes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comparator);
        tvDes = findViewById(R.id.tv_des);
        tvDes.setText("Comparator 比较器");
    }

    class A {
        int a;

        public A(int a) {
            this.a = a;
        }

        @Override
        public String toString() {
            return "[a=" + a + "]";
        }

    }

    class MyComparator implements Comparator<A> {

        @Override
        public int compare(A o1, A o2) {
            //升序
            return o1.a - o2.a;
            //降序：后面会具体分析为什么降序
//            return o2.a - o1.a;
        }

    }

    /**
     * Comparator 测试
     * @param v
     */
    public void onComparator1(View v) {
        A a1 = new A(5);
        A a2 = new A(7);
        List<A> list = new ArrayList<A>();
        list.add(a1);
        list.add(a2);
        Collections.sort(list, new MyComparator());
        System.out.println(list);
    }

    /**
     * TreeMap 实现键升序
     * @param v
     */
    public void onTreeMapAsc(View v) {

        //创建 TreeMap 集合
        TreeMap<Integer,UserInfo> userTreeMap = new TreeMap<>();

        //获取用户信息列表
        userTreeMap.putAll(getUserMap());

        //遍历用户信息列表
        System.out.println("TreeMap集合，实现Key升序：");
        for(Iterator<Integer> it = userTreeMap.keySet().iterator(); it.hasNext();) {
            int key = it.next();
            UserInfo value = userTreeMap.get(key);

            System.out.println("Key键：" + key);
            System.out.println("Value值：" + value);
        }
    }

    /**
     * TreeMap 实现键降序
     * @param v
     */
    public void onTreeMapDesc(View v) {
        //创建 TreeMap 集合，设置Key降序方法一：
        //TreeMap<Integer,UserInfo> userTreeMap = new TreeMap<>(Collections.reverseOrder());

        //创建 TreeMap 集合，设置Key降序方法二：
        TreeMap<Integer,UserInfo> userTreeMap = new TreeMap<Integer,UserInfo>(new Comparator<Integer>()
        {
            public int compare(Integer key1,Integer key2)
            {
                //降序排序
                return key2.compareTo(key1);
            }
        });

        //获取用户信息列表
        userTreeMap.putAll(getUserMap());

        //遍历用户信息列表
        System.out.println("TreeMap集合，实现Key降序：");
        for(Iterator<Integer> it = userTreeMap.keySet().iterator(); it.hasNext();)
        {
            int key = it.next();
            UserInfo value = userTreeMap.get(key);

            System.out.println("Key键：" + key);
            System.out.println("Value值：" + value);
        }
    }

    /**
     * TreeMap 实现Value值的排序
     * @param v
     */
    public void onTreeMapValue(View v) {
        //创建 TreeMap 集合
        TreeMap<Integer,UserInfo> userTreeMap = new TreeMap<>();

        //获取用户信息列表
        userTreeMap.putAll(getUserMap());

        //将Map转换成List
        List<Map.Entry<Integer,UserInfo>> list = new ArrayList<Map.Entry<Integer,UserInfo>>(userTreeMap.entrySet());

        // 通过比较器来实现排序
        Collections.sort(list, new Comparator<Map.Entry<Integer,UserInfo>>()
        {
            @Override
            public int compare(Map.Entry<Integer,UserInfo> user1, Map.Entry<Integer,UserInfo> user2)
            {
                Integer age1 = user1.getValue().getAge();
                Integer age2 = user2.getValue().getAge();

                //按照用户年龄降序
                return age2.compareTo(age1);
            }
        });

        //遍历用户信息列表
        System.out.println("TreeMap集合，实现Value排序，按照用户年龄降序：");
        for (Map.Entry<Integer,UserInfo> mapping : list)
        {
            System.out.println("Key键：" + mapping.getKey());
            System.out.println("Value值：" + mapping.getValue());
        }

    }

    /**
     * 获取用户信息列表
     * @author pan_junbiao
     */
    private Map<Integer,UserInfo> getUserMap() {
        Map<Integer,UserInfo> userMap = new HashMap<>();

        //创建用户信息
        UserInfo user1 = new UserInfo(1,"pan_junbiao的博客", 25, "您好，欢迎访问 pan_junbiao的博客");
        UserInfo user2 = new UserInfo(2,"pan_junbiao的博客", 18, "https://blog.csdn.net/pan_junbiao");
        UserInfo user3 = new UserInfo(3,"pan_junbiao的博客", 35, "您好，欢迎访问 pan_junbiao的博客");
        UserInfo user4 = new UserInfo(4,"pan_junbiao的博客", 32, "https://blog.csdn.net/pan_junbiao");

        //将用户信息加入Map（故意打乱顺序）
        userMap.put(user4.getUserId(),user4);
        userMap.put(user2.getUserId(),user2);
        userMap.put(user3.getUserId(),user3);
        userMap.put(user1.getUserId(),user1);

        return userMap;
    }

}