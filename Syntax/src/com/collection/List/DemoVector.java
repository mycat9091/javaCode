package com.collection.List;

import java.util.Enumeration;
import java.util.Vector;

/**
 * 演示Vector集合的使用
 * 存储结构：数组
 */
public class DemoVector {
    public static void main(String[] args) {
        //创建集合
        Vector vector = new Vector<>();
        //条件元素
        vector.add("A");
        vector.add("B");
        vector.add("C");
        System.out.println("元素个数："+vector.size());
        //删除
//        vector.remove(0);
//        vector.remove("A");
//        vector.clear();
        //遍历
        //使用枚举器
        Enumeration en = vector.elements();
        while (en.hasMoreElements()) {
            String o = (String)en.nextElement();
            System.out.println(o);
        }
        //判断
        System.out.println(vector.contains("C"));
        System.out.println(vector.isEmpty());

        //其他方法
        //firstElement、lastElement、ElementAt();
    }
}
