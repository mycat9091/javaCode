package com.collection.List;

import com.collection.Student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * LinkedList的使用
 * 存储结构：双向链表
 */
public class DemoLinkedList {
    public static void main(String[] args) {

        //创建集合gi
        LinkedList linkedList = new LinkedList<>();
        //添加元素
        Student s1 = new Student("AAA",20);
        Student s2 = new Student("BBB",22);
        Student s3 = new Student("CCC",24);
        linkedList.add(s1);
        linkedList.add(s2);
        linkedList.add(s3);

        System.out.println("元素个数："+linkedList.size());
        System.out.println(linkedList.toString());

        //删除
//        linkedList.remove(new Student("BBB",22));
//        System.out.println("删除之后："+linkedList.size());
//        linkedList.clear();

        //遍历
        //for
        System.out.println("for");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
        //增强for
        System.out.println("增强for");
        for (Object object : linkedList) {
            Student s = (Student)object;
            System.out.println(s.toString());
        }
        //使用迭代器
        System.out.println("使用迭代器");
        Iterator it =linkedList.iterator();
        while (it.hasNext()) {
            Student s = (Student)it.next();
            System.out.println(s.toString());
        }
        //使用列表迭代器
        System.out.println("使用列表迭代器");
        ListIterator lit = linkedList.listIterator();
        while (lit.hasNext()) {
            Student s = (Student)lit.next();
            System.out.println(s.toString());
        }
        //判断
        System.out.println(linkedList.contains(s1));
        System.out.println(linkedList.isEmpty());
        //获取
        System.out.println(linkedList.indexOf(s2));

    }
}
