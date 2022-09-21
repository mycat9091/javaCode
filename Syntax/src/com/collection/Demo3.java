package com.collection;

import java.util.ArrayList;
import java.util.List;

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
    }
}
