package com.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection接口的使用
 * -添加元素
 * -移除元素
 * -遍历元素
 * 判断
 */
public class Demo1 {
    public static void main(String[] args) {

        //创建集合
        Collection collection = new ArrayList();
        //添加元素
        collection.add("苹果");
        collection.add("西瓜");
        collection.add("榴莲");
        System.out.println("元素个数："+collection.size());
        System.out.println(collection);
        //删除元素
//        collection.remove("榴莲");
//        //collection.clear();
//        System.out.println("删除之后："+collection.size());
//        System.out.println(collection);
        //遍历元素*
        //使用增强for
        System.out.println("使用增强for");
        for (Object object : collection){
            System.out.println(object);
        }
        //使用迭代器
        //hasNext();有没有下一个元素
        //next();获取下一个元素
        //remove();删除当前元素
        System.out.println("使用迭代器");
        Iterator it = collection.iterator();
        while (it.hasNext()){
            String s = (String)it.next();
            System.out.println(s);
            //不能使用collection删除方法
            //collection.remove(s);
            //it.remove();
        }
        System.out.println("元素个数"+collection.size());

        //判断
        System.out.println(collection.contains("西瓜"));
        System.out.println(collection.isEmpty());
    }
}
