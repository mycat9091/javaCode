package com.collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * 使用TreeSet保存数据
 * 存储结构：红黑树
 * 要求：元素必须要实现Comparable接口
 */
public class DemoTreeSet_2 {
    public static void main(String[] args) {
        //创建集合
        TreeSet<Person> persons = new TreeSet<>();
        //添加元素
        Person p1 = new Person("ab",12);
        Person p2 = new Person("ac",13);
        Person p3 = new Person("ad",14);
        Person p4 = new Person("bc",23);
        persons.add(p1);
        persons.add(p2);
        persons.add(p3);
        persons.add(p4);
        System.out.println("元素个数：" + persons.size());
        System.out.println(persons.toString());
        //删除元素
        persons.remove(p4);
        System.out.println("删除之后：" + persons.size());
        System.out.println(persons.toString());
        //遍历
        //增强for
        System.out.println("增强for");
        for (Person person : persons) {
            System.out.println(person);
        }
        //迭代器
        System.out.println("迭代器");
        Iterator it = persons.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //判断
        System.out.println("判断");
        System.out.println(persons.contains(new Person("ad",14)));
        System.out.println(persons.isEmpty());
    }
}
