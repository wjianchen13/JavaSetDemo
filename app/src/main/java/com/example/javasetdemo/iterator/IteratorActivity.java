package com.example.javasetdemo.iterator;

import static com.example.javasetdemo.Utils.log;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.javasetdemo.R;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * 测试Iterator
 */
public class IteratorActivity extends AppCompatActivity {

    private TextView tvDes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iterator);
        tvDes = findViewById(R.id.tv_des);
        tvDes.setText("测试Iterator");
    }

    /**
     * Iterator 测试
     * @param v
     */
    public void onIterator(View v) {
        ArrayList<String> a = new ArrayList<>();
        a.add("aaa");
        a.add("bbb");
        a.add("ccc");
        System.out.println("Before iterate : " + a);
        Iterator<String> it = a.iterator();
        while (it.hasNext()) {
            String t = it.next();
            if ("bbb".equals(t)) {
                it.remove();
            }
        }
        System.out.println("After iterate : " + a);
    }


    /**
     * ListIterator 测试
     *   aaa bbb ccc
     * ^
     * 最开始指向a之前，所以previousIndex = -1 nextIndex = 0
     * 调用next只有，指向aaa 和 bbb中间， previousIndex = 0 nextIndex = 1
     * @param v
     */
    public void onListIterator(View v) {
        ArrayList<String> a = new ArrayList<>();
        a.add("aaa");
        a.add("bbb");
        a.add("ccc");
        System.out.println("Before iterate : " + a);
        ListIterator<String> it = a.listIterator();
        while (it.hasNext()) {
            System.out.println(it.next() + ", " + it.previousIndex() + ", " + it.nextIndex());
        }
        while (it.hasPrevious()) {
            System.out.print(it.previous() + " ");
        }
        System.out.println();
        it = a.listIterator(1);
        while (it.hasNext()) {
            String t = it.next();
            System.out.println(t);
            if ("ccc".equals(t)) {
                it.set("nnn");
                System.out.println("After iterate1 : " + a);
            } else {
                it.add("kkk");
                System.out.println("After iterate2 : " + a);
            }
        }
        System.out.println("After iterate : " + a);
    }

}