package com.collection.List;

import com.collection.Student;

import java.util.LinkedList;

/**
 * LinkedList的使用
 * 存储结构：双向链表
 */
public class DemoLinkedList {
    public static void main(String[] args) {

        //创建集合
        LinkedList linkedList = new LinkedList<>();
        //添加元素
        Student s1 = new Student("AAA",20);
        Student s2 = new Student("BBB",22);
        Student s3 = new Student("CCC",24);
        linkedList.add(s1);
        linkedList.add(s2);
        linkedList.add(s3);
        System.out.println();
    }
}
