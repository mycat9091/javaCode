package com.collection.Set;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 测试Set接口的使用
 * 特点：无序、无下标、不能重复
 */
public class DemoSet {
    public static void main(String[] args) {

        //创建集合
        Set<String> set = new HashSet<>();
        //添加数据
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        System.out.println("数据个数" + set.size());
        System.out.println(set.toString());
        //删除数据
        System.out.println("删除数据");
        set.remove("d");
        System.out.println("数据个数" + set.size());
        System.out.println(set.toString());
        //遍历*
        //使用增强for
        System.out.println("使用增强for");
        for (String str : set) {
            System.out.println(str);
        }
        //使用迭代器
        System.out.println("使用迭代器");
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
