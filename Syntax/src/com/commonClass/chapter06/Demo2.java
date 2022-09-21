package com.commonClass.chapter06;

public class Demo2 {
    public static void main(String[] args) {
        //面试题
        Integer integer1 = new Integer(100);
        Integer integer2 = new Integer(100);
        System.out.println(integer1==integer2);
        System.out.println();

        //等于Integer integer3 = Integer.valueOf(100);
        Integer integer3 = 100;
        Integer integer4 = 100;
        System.out.println(integer3==integer4);

        Integer integer5 = 200;
        Integer integer6 = 200;
        System.out.println(integer5==integer6);
        System.out.println();

        int a = 127;
        int b = 127;
        Integer integer7 = a;
        Integer integer8 = b;
        System.out.println(integer7==integer8);

        int c = 128;
        int d = 128;
        Integer integer9 = c;
        Integer integer10 = d;
        System.out.println(integer9==integer10);
    }
}
