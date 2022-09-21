package com.collection;

import java.util.ArrayList;

import java.util.List;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


/**
 * List子接口的使用
 * 特点：1、有序有下标 2、可重复
 */
public class Demo3 {
    public static void main(String[] args) {
        //先创建集合对象
        List list = new ArrayList<>();
        //添加元素
        list.add("苹果");
        list.add("小米");
        list.add(0,"魅族");

        System.out.println("元素个数" + list.size());
        System.out.println(list.toString());
        //删除元素
        list.remove("苹果");
        list.remove(0);
        System.out.println("删除之后" + list.size());
        System.out.println(list.toString());

        System.out.println("元素个数：" + list.size());
        System.out.println(list.toString());
        //删除元素
//        list.remove("苹果");
//        list.remove(0);
//        System.out.println("删除之后：" + list.size());
//        System.out.println(list.toString());
        //遍历
        System.out.println("使用for循环");
        for (int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("使用增强for循环");
        for (Object object : list){
            System.out.println(object);
        }

        System.out.println("使用迭代器");
        Iterator it = list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //ListIterator可以向前或向后遍历，添加，删除，修改元素
        System.out.println("使用列表迭代器");
        ListIterator lit = list.listIterator();
        System.out.println("使用列表迭代器从前往后遍历");
        while (lit.hasNext()){
            System.out.println(lit.nextIndex()+":"+lit.next());
        }

        //Previous:前一个
        System.out.println("使用列表迭代器从后往前遍历");
        while (lit.hasPrevious()){
            System.out.println(lit.previousIndex()+":"+lit.previous());
        }

        //判断
        System.out.println("判断");
        System.out.println(list.contains("苹果"));
        System.out.println(list.isEmpty());

        //获取位置
        System.out.println("获取位置");
        System.out.println(list.indexOf("魅族"));
    }
}
