package com.commonClass.chapter06;

public class Demo1 {
    public static void main(String[] args) {

//        int num = 10;

        //装箱：基本类型转换为引用类型
        //基本类型
        int num1 = 18;
        //使用Integer类创建对象
        Integer integer1 = new Integer(num1);//已弃用
        Integer integer2 = Integer.valueOf(num1);
        System.out.println("装箱");
        System.out.println(integer1);
        System.out.println(integer2);

        //拆箱：引用类型转换为基本类型
        Integer integer3 = new Integer(100);//已弃用
        int num2 = integer3.intValue();
        System.out.println("拆箱");
        System.out.println(num2);

        //JDK1.5后，提供自动装箱和拆箱
        int age = 30;
        //自动装箱
        Integer integer4 = age;
        System.out.println("自动装箱");
        System.out.println(integer4);
        //自动拆箱
        int age2 = integer4;
        System.out.println("自动拆箱");
        System.out.println(age2);

        //基本类型和字符串之间转换
        //基本类型转换成字符串
        int n1 = 255;
        //使用+号
        String s1 = n1+"";
        //使用Integer中的toString()方法
        //radix进制
        String s2 = Integer.toString(n1,16);
        System.out.println("基本类型转换成字符串");
        System.out.println(s1);
        System.out.println(s2);

        //字符串转换成基本类型
        String str = "150";
        //使用Integer.parseInt(str);
        int n2 = Integer.parseInt(str);
        System.out.println("使用Integer.parseInt(str)");
        System.out.println(str);

        //boolean类型字符串形式转换成基本类型，"true"-->true;非true-->false
        String str2 = "true";
        boolean b1 = Boolean.parseBoolean(str2);
        System.out.println("boolean类型字符串形式转换成基本类型");
        System.out.println(b1);

    }
}
