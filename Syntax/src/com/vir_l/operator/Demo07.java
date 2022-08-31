package com.vir_l.operator;

public class Demo07 {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        int c = 20;

        a+=c; //a=a+c
        b-=c; //b=b-c
        System.out.println(a);
        System.out.println(b);

        //字符串连接符
        System.out.println(a+b);
        System.out.println(""+a+b);
        System.out.println(+a+b+"");
    }
}
