package com.collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * TreeSet的使用
 * 存储结构：红黑树
 */
public class DemoTreeSet {
    public static void main(String[] args) {

        //创建集合
        TreeSet<String> treeSet = new TreeSet<>();
        //添加元素
        treeSet.add("aa");
        treeSet.add("bb");
        treeSet.add("cc");
        treeSet.add("dd");
        System.out.println("数据个数:" + treeSet.size());
        System.out.println(treeSet.toString());

        //删除
        treeSet.remove("dd");
        System.out.println("删除之后"+treeSet.size());
        //遍历
        //增强for
        System.out.println("增强for");
        for (String str : treeSet) {
            System.out.println(str);
        }
        //迭代器
        System.out.println("迭代器");
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //判断
        System.out.println("判断");
        System.out.println(treeSet.contains("aa"));
        System.out.println(treeSet.isEmpty());
    }
}
