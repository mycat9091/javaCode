package com.vir_l.basic;

public class demo05 {
    public static void main(String[] args) {
        int money = 10_0000_0000;
        //jdk7特性，可以用下划线分割数字
        int years = 20;
        int total = money*years;//-1474836480,转换溢出
        long total2 = money*years;//-1474836480，转换前已经出错

        long total3 =money*((long)years);
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);
    }
}
