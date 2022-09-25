package com.collection.Generic;

import com.collection.Student;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("xxx");
        arrayList.add("yyy");
//        arrayList.add(10);
//        arrayList.add(20);

        for (String str : arrayList) {
            System.out.println(str);
        }

        ArrayList<Student> arrayList2 = new ArrayList<Student>();
        Student s1 = new Student("张三",20);
        Student s2 = new Student("李四",22);
        Student s3 = new Student("王五",18);
        arrayList2.add(s1);
        arrayList2.add(s2);
        arrayList2.add(s3);

        Iterator<Student> it = arrayList2.iterator();
        while (it.hasNext()) {
            Student s =it.next();
            System.out.println(s.toString());
        }
//        arrayList = arrayList2
    }
}
