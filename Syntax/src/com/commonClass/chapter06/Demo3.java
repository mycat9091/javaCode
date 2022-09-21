package com.commonClass.chapter06;

import java.util.Arrays;

public class Demo3 {
    public static void main(String[] args) {
        String name = "hello";//"hello"存储在字符串池中
        name = "xx";//"xx"赋值给name，给字符串赋值时，没有修改数据，而是重新开辟空间
        String name2 = "xx";

        //字符串new 创建模式
        String str = new String("Java是最好的编程语言");
        String str2 = new String("Java是最好的编程语言");
        System.out.println(str==str2);
        System.out.println(str.equals(str2));
        System.out.println();

        //字符串方法的使用
        //length();返回字符串的长度
        //charAt(int index);返回某个位置的字符
        //contains(String str);判断是否包含某个字符串

        String content = "java是世界上最好的编程语言,java,java";
        System.out.println(content.length());
        System.out.println(content.charAt(content.length()-1));
        System.out.println(content.contains("java"));
        System.out.println(content.contains("php"));
        System.out.println();

        //toCharArray();返回字符串对弈的数组
        //indexOf();返回字符串首次出现的位置
        //lastIndexOf;返回字符串最后一次出现的位置

        System.out.println(Arrays.toString(content.toCharArray()));
        System.out.println(content.indexOf("java"));
        System.out.println(content.indexOf("java",4));
        System.out.println(content.lastIndexOf("java"));
        System.out.println();

        //trim();去掉字符串前后的空格
        //toUpperCase();把小写转换成大写
        //toLowerCase();把大写转换成小写
        //startWith(str);判断字符串是否以str开头
        //endWith(str);判断字符串是否以str结尾
        String content2 = "  Hello world  ";
        System.out.println(content2.trim());
        System.out.println(content2.toUpperCase());
        System.out.println(content2.toLowerCase());
        String filename = "hello.java";
        System.out.println(filename.endsWith(".java"));
        System.out.println(filename.startsWith("hello"));
        System.out.println();

        //replace();用新的字符或字符串替换旧的字符或字符串
        //split();对字符进行拆分

        System.out.println(content.replace("java","php"));
        String say = "java is the best programing language,java xiang";
        String[] arr = say.split("[ ,]+");
        System.out.println(arr.length);
        for (String string : arr){
            System.out.println(string);
        }

        //equals、compare()；比较大小
        System.out.println("===补充===");
        String s1 = "hello";
        String s2 = "HELLO";
        System.out.println(s1.equals(s2));
        //忽略大小写的比较
        System.out.println(s1.equalsIgnoreCase(s2));

        //长度相同逐个相减
        String s3 = "abc";
        String s4 = "xyz";
        System.out.println(s3.compareTo(s4));

        //长度不同字符串长度相减
        String s5 = "abc";
        String s6 = "abcxyz";
        System.out.println(s5.compareTo(s6));
    }
}
