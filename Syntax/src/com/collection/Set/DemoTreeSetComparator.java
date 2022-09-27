package com.collection.Set;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet集合的使用
 * Comparator：实现定制比较(比较器)
 * Comparable：可比较的
 */
public class DemoTreeSetComparator {
    public static void main(String[] args) {
        //创建集合,指定比较规则
        TreeSet<Person> persons = new TreeSet<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                int n1 = o1.getAge()-o2.getAge();
                int n2 = o1.getName().compareTo(o2.getName());
                return n1==0 ? n2 : n1;
            }
        });
        //添加元素
        Person p1 = new Person("ab",12);
        Person p2 = new Person("ac",13);
        Person p3 = new Person("ad",14);
        Person p4 = new Person("bc",13);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        System.out.println(persons.toString());
        //删除元素
        //遍历
        //判断
    }
}
