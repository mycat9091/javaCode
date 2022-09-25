package com.collection.Set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet集合的使用
 * 存储结构：哈希表(数组+链表+黑红树)
 */
public class DemoHashSet {
    public static void main(String[] args) {
        //新建集合
        HashSet<String> hashSet = new HashSet<String>();
        //添加元素
        hashSet.add("aa");
        hashSet.add("bb");
        hashSet.add("cc");
        hashSet.add("dd");
        hashSet.add("dd");
        System.out.println("数据个数:" + hashSet.size());
        System.out.println(hashSet.toString());
        //删除数据
        hashSet.remove("dd");
        System.out.println("数据个数:" + hashSet.size());
        System.out.println(hashSet.toString());
        //遍历
        //增强for
        System.out.println("使用增强for");
        for (String str : hashSet) {
            System.out.println(str);
        }
        //迭代器
        System.out.println("使用迭代器");
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //判断
        System.out.println("判断");
        System.out.println(hashSet.contains("aa"));
        System.out.println(hashSet.isEmpty());
    }
}
