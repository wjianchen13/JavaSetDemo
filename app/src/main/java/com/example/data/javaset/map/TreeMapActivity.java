package com.example.data.javaset.map;

import static com.example.data.javaset.Utils.log;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.data.R;

import java.util.Collection;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * TreeMap 相关使用方法
 */
public class TreeMapActivity extends AppCompatActivity {

    private TextView tvDes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        tvDes = findViewById(R.id.tv_des);
        tvDes.setText("测试TreeMap");
    }

    /**
     * Map遍历
     * @param v
     */
    public void onTraverse1(View v) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "test1");
        map.put(3, "test3");
        map.put(6, "test6");
        map.put(7, "test7");
        map.put(10, "test10");
        map.put(2, "test2");
        map.put(4, "test4");
        map.put(9, "test9");
        map.put(8, "test8");
        map.put(5, "test5");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int mapKey = entry.getKey();
            String mapValue = entry.getValue();
            System.out.println(mapKey + "：" + mapValue);
        }
    }

    /**
     * Map遍历
     * @param v
     */
    public void onTraverse2(View v) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "test1");
        map.put(2, "test2");
        map.put(3, "test3");
        // 打印键集合
        for (Integer key : map.keySet()) {
            System.out.println(key);
        }
        // 打印值集合
        for (String value : map.values()) {
            System.out.println(value);
        }
    }

    /**
     * Map遍历
     * @param v
     */
    public void onTraverse3(View v) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "test1");
        map.put(2, "test2");
        map.put(3, "test3");
        Iterator<Map.Entry<Integer, String>> entries = map.entrySet().iterator();
        while (entries.hasNext()) {
            Map.Entry<Integer, String> entry = entries.next();
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }

    /**
     * Map遍历
     * @param v
     */
    public void onTraverse4(View v) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "test1");
        map.put(2, "test2");
        map.put(3, "test3");
        for(int key : map.keySet()){
            String value = map.get(key);
            System.out.println(key+":"+value);
        }
    }

    /**
     * clear()
     * @param v
     */
    public void onClear(View v) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "test1");
        map.put(3, "test3");
        map.put(2, "test2");
        log("onClear(): " + map);
        map.clear();
        log("onClear(): " + map);
    }

    /**
     * containsKey()
     * @param v
     */
    public void onContainsKey(View v) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "test1");
        map.put(3, "test3");
        map.put(2, "test2");
        log("onContainsKey(): " + map.containsKey(3));
        log("onContainsKey(): " + map.containsKey(5));
    }

    /**
     * containsValue()
     * @param v
     */
    public void onContainsValue(View v) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "test1");
        map.put(3, "test3");
        map.put(2, "test2");
        log("onContainsValue(): " + map.containsValue("test1"));
        log("onContainsValue(): " + map.containsValue("test5"));
    }

    /**
     * get()
     * @param v
     */
    public void onGet(View v) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "test1");
        map.put(3, "test3");
        map.put(2, "test2");
        log("onGet(): " + map.get(1));
    }

    /**
     * put()
     * @param v
     */
    public void onPut(View v) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "test1");
        map.put(3, "test3");
        map.put(2, "test2");
        log("onPut(): " + map);
    }

    /**
     * putAll()
     * @param v
     */
    public void onPutAll(View v) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "test1");
        map.put(3, "test3");
        map.put(2, "test2");
        log("onPut() map: " + map);
        Map<Integer, String> map1 = new TreeMap<>();
        map1.put(5, "test5");
        map1.put(6, "test6");
        map1.put(4, "test4");
        log("onPut() map1: " + map1);
        map.putAll(map1);

        log("onPut() map: " + map);
    }

    /**
     * remove()
     * @param v
     */
    public void onRemove(View v) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "test1");
        map.put(3, "test3");
        map.put(2, "test2");
        String remove1 = map.remove(1);
        String remove2 = map.remove(5);
        log("onRemove() map: " + map + "  remove1: " + remove1 + "  remove2: " + remove2);
    }

    /**
     * remove()
     * @param v
     */
    public void onRemove1(View v) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "test1");
        map.put(3, "test3");
        map.put(2, "test2");
        log("onRemove() map: " + map);
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            boolean remove1 = map.remove(1, "test1");
            boolean remove2 = map.remove(12, "test1");
            log("onRemove() map: " + map + "  remove1: " + remove1 + "  remove2: " + remove2);
        }
    }


    /**
     * entrySet()
     * @param v
     */
    public void onEntrySet(View v) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "test1");
        map.put(3, "test3");
        map.put(2, "test2");

        Set<Map.Entry<Integer, String>> set = map.entrySet();
        for (Map.Entry<Integer, String> entry : set) {
            int mapKey = entry.getKey();
            String mapValue = entry.getValue();
            System.out.println(mapKey + "：" + mapValue);
        }

    }

    /**
     * keySet()
     * @param v
     */
    public void onKeySet(View v) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "test1");
        map.put(2, "test2");
        map.put(3, "test3");
        for(int key : map.keySet()){
            String value = map.get(key);
            System.out.println(key+":"+value);
        }
    }

    /**
     * isEmpty()
     * @param v
     */
    public void onIsEmpty(View v) {
        Map<Integer, String> map = new TreeMap<>();
        log("onIsEmpty() map isEmpty: " + map.isEmpty());
        map.put(1, "test1");
        map.put(2, "test2");
        map.put(3, "test3");
        log("onIsEmpty() map isEmpty: " + map.isEmpty());
    }

    /**
     * size()
     * @param v
     */
    public void onSize(View v) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "test1");
        map.put(2, "test2");
        map.put(3, "test3");
        log("onSize() map size: " + map.size());
    }

    /**
     * values()
     * @param v
     */
    public void onValues(View v) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "test1");
        map.put(2, "test2");
        map.put(3, "test3");
        Collection<String> values = map.values();
        for(String value: values) {
            // 输出每一个value
            log("onValues() value: " + value);
        }
    }

}