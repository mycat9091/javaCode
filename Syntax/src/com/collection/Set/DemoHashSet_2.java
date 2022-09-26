package com.collection.Set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet的使用
 * 存储结构哈希表
 * 存储过程：
 * - 根据HashCode计算保存的位置，如果此位置为空，则直接保存，如果不为空这行第二步
 * - 再执行equals方法，如果equals方法为true，则保存，否则形成链表
 */
public class DemoHashSet_2 {
    public static void main(String[] args) {
        //创建集合
        HashSet<Person> person= new HashSet<>();
        //添加数据
        Person p1 = new Person("aaa",19);
        Person p2 = new Person("bbb",22);
        Person p3 = new Person("ccc",99);
        Person p4 = new Person("ddd",99);
        person.add(p1);
        person.add(p2);
        person.add(p3);
        person.add(p4);
        person.add(new Person("ddd",99));//新开辟了空间
        System.out.println("数据个数:" + person.size());
        System.out.println(person.toString());
        //删除数据
        person.remove(p4);
        System.out.println("删除之后:" + person.size());
        System.out.println(person.toString());

        //遍历*
        //增强for
        System.out.println("增强for");
        for (Person person1 : person) {
            System.out.println(person1.toString());
        }
        //遍历
        System.out.println("遍历");
        Iterator it = person.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
