package com.collection;

import com.collection.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Collection的使用，保存学生信息
 *
 */
public class Demo2 {
    public static void main(String[] args) {

        //新建Collection对象
        Collection collection = new ArrayList();
        Student s1 = new Student("张三",20);
        Student s2 = new Student("李四",22);
        Student s3 = new Student("王五",18);

        //添加数据
        collection.add(s1);
        collection.add(s2);
        collection.add(s3);
        System.out.println("元素个数："+collection.size());
        System.out.println(collection.toString());
        //删除
//        collection.remove(s1);
//        collection.clear();
//        System.out.println("删除之后："+collection.size());

        //遍历
        //增强fot
        System.out.println("增强fot");
        for (Object object : collection){
            Student s = (Student) object;
            System.out.println(s.toString());
        }
        //迭代器：hashNext(),next(),remove()
        System.out.println("迭代器");
        Iterator it = collection.iterator();
        while (it.hasNext()){
            Student s = (Student) it.next();
            System.out.println(s.toString());
        }
        //判断
        System.out.println(collection.contains(s1));
        System.out.println(collection.isEmpty());
    }
}
