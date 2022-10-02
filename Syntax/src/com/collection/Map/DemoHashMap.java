package com.collection.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * HashMap集合的使用
 * 存储结构：哈希表（数组+链表+红黑树）
 * key使用hashCode和equals进行查重
 */
public class DemoHashMap {
    public static void main(String[] args) {

        //创建集合
        HashMap<Student,String> student = new HashMap<>();
        //刚创建HashMap没有添加元素时，table=null，size=0
        //添加元素
        Student s1 = new Student("孙悟空",1001);
        Student s2 = new Student("猪八戒",1002);
        Student s3 = new Student("沙和尚",1003);
        Student s4 = new Student("白龙马",1004);
        student.put(s1,"北京");
        student.put(s2,"上海");
        student.put(s3,"杭州");
        student.put(s4,"深圳");
        student.put(new Student("白龙马",1004),"深圳");
        System.out.println("元素个数："+student.size());
        System.out.println(student.toString());
        //删除
        student.remove(s4);
        System.out.println("删除之后："+student.size());
        //遍历
        //使用keySet
        System.out.println("使用keySet()");
        for (Student key : student.keySet()) {
            System.out.println(key.toString()+"---"+student.get(key));
        }
        //使用entrySet
        System.out.println("使用entrySet()");
        for (Map.Entry<Student,String> entry : student.entrySet()) {
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }
        //判断
        System.out.println(student.containsKey(s1));
        System.out.println(student.containsValue("上海"));
        System.out.println(student.isEmpty());
    }
}
