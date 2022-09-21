package com.collection.List;

import java.util.ArrayList;
import java.util.List;

/**
 * List的使用
 */
public class Demo2 {
    public static void main(String[] args) {
        //创建集合
        List list = new ArrayList();
        //添加数字数据(自动装箱)
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println("元素个数："+list.size());
        System.out.println(list.toString());

        //删除操作
        //list.remove(0);
        //list.remove((Object) 20);
        //list.remove(new Integer(20));
        //list.remove(list.indexOf(20));
        System.out.println("删除元素："+list.size());
        System.out.println(list.toString());

        //补充方法subList，返回子集合，含头不含尾
        List subList = list.subList(1,3);
        System.out.println(subList.toString());
    }
}
