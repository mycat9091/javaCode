package com.collection.List;

import com.collection.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * ArrayList的使用
 * 存储结构：数组  查询快、增删慢
 */
public class DemoArrayL {
    public static void main(String[] args) {
        //添加元素
        ArrayList arrayList = new ArrayList<>();
        Student s1 = new Student("A", 20);
        Student s2 = new Student("B", 22);
        Student s3 = new Student("C", 25);
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        System.out.println("元素个数："+ arrayList.size());
        System.out.println(arrayList.toString());

        //删除元素
        //重写了equals
//        arrayList.remove(new Student("A",20));
//        System.out.println("删除之后："+arrayList.size());

        //遍历元素*
        //使用迭代器
        System.out.println("使用迭代器");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Student s = (Student)it.next();
            System.out.println(s.toString());
        }

        //使用列表迭代器
        System.out.println("使用列表迭代器");
        ListIterator lit = arrayList.listIterator();
        while (lit.hasNext()) {
            Student s = (Student)lit.next();
            System.out.println(s.toString());
        }

        //判断
        System.out.println("判断");
        System.out.println(arrayList.contains(new Student("A",20)));
        System.out.println(arrayList.isEmpty());

        //查找
        System.out.println("查找");
        System.out.println(arrayList.indexOf(new Student("B",22)));

    }
}
