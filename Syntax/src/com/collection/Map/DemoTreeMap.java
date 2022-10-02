package com.collection.Map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * TreeMap的使用
 * 存储结构：红黑树
 */
public class DemoTreeMap {
    public static void main(String[] args) {
        //创建集合(定制比较)
        TreeMap<Student, String> treeMap = new TreeMap<>();
//        TreeMap<Student, String> treeMap = new TreeMap<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return 0;
//            }
//        });
        //添加元素
        Student s1 = new Student("孙悟空",1001);
        Student s2 = new Student("猪八戒",1002);
        Student s3 = new Student("沙和尚",1003);
        Student s4 = new Student("白龙马",1004);
        treeMap.put(s1,"北京");
        treeMap.put(s2,"上海");
        treeMap.put(s3,"深圳");
        treeMap.put(s4,"长沙");
        treeMap.put(new Student("沙和尚",1003),"南京");
        System.out.println("元素个数:"+treeMap.size());
        System.out.println(treeMap.toString());
        //删除
//        treeMap.remove(s4);
//        treeMap.remove(new Student("沙和尚",1003));
//        System.out.println(treeMap.size());
        //遍历
        //使用keySet
        System.out.println("使用keySet()");
        for (Student key : treeMap.keySet()) {
            System.out.println(key+"====="+treeMap.get(key));
        }
        //使用entrySet
        System.out.println("使用entrySet()");
        for (Map.Entry<Student,String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey()+"======"+entry.getValue());
        }
        //判断
        System.out.println(treeMap.containsKey(new Student("沙和尚",1003)));
        System.out.println(treeMap.containsValue("南京"));
        System.out.println(treeMap.isEmpty());
    }
}
