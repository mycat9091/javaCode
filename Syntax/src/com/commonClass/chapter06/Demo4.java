package com.commonClass.chapter06;
/*
	- 已知 String str = "this is a text";
	- 将str中的单词单独获取出来
	- 将str中的text替换为practice
	- 在text前插入一个easy
	- 将每个单词的首字母改为大写
 */
public class Demo4 {
    public static void main(String[] args) {

        String str = "this is a text";

        //将str中的单词单独获取出来
        String[] arr = str.split(" ");
        System.out.println("将str中的单词单独获取出来");
        for (String s : arr){
            System.out.println(s);
        }
        //将str中的text替换为practice
        System.out.println("将str中的text替换为practice");
        String str2 = str.replace("text","practice");
        System.out.println(str2);
        //在text前插入一个easy
        System.out.println("在text前插入一个easy");
        String str3 = str.replace("text","easy text");
        System.out.println(str3);
        //将每个单词的首字母改为大写
        System.out.println("将每个单词的首字母改为大写");
        for (int i = 0; i < arr.length; i++){
            char first = arr[i].charAt(0);
            //把第一个字符转换成大写
            char upperFirst = Character.toUpperCase(first);

            String news = upperFirst + arr[i].substring(1);
            System.out.print(news);
            if (i != arr.length){
                System.out.print(" ");
            }
        }
    }
}
