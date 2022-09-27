package com.collection.Set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet案例
 * 要求：使用TreeSet集合实现字符串按照长度进行排序
 * helloworld zhang list wanghu vir
 * Comparator接口定制比较规则
 */
public class DemoTreeSetCase {
    public static void main(String[] args) {
        //创建集合，指定规则
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int n1 = o1.length()-o2.length();
                int n2 = o1.compareTo(o2);
                return n1==0 ? n2 : n1;
            }
        });

        //添加数据
        treeSet.add("helloworld");
        treeSet.add("zhang");
        treeSet.add("list");
        treeSet.add("wanghu");
        treeSet.add("vir");
        treeSet.add("cat");
        treeSet.add("dog");
        System.out.println(treeSet.toString());
    }
}
