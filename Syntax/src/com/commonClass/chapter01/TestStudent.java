package com.commonClass.chapter01;

public class TestStudent {
    public static void main(String[] args) {

        //getClass方法
        Student s1 = new Student("aaa",20);
        Student s2 = new Student("bbb",22);
        //判断s1和s2是不是同一个类型
        Class class1 = s1.getClass();
        Class class2 = s2.getClass();

        if (class1==class2){
            System.out.println("s1和s2属于同一个类型");
        }else {
            System.out.println("s1和s2不属于同一个类型");
        }
        System.out.println();

        //hashCode方法
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        Student s3 = s1;
        System.out.println(s3.hashCode());
        System.out.println();

        //toString方法
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println();

        //equals方法，判断两个对象是否相等
        System.out.println(s1.equals(s2));

        Student s4 = new Student("小明",17);
        Student s5 = new Student("小明",17);
        System.out.println(s4.equals(s5));
        System.out.println();
    }
}
