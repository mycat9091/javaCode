package com.vir_l.operator;

//关系运算符
public class Demo04 {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(a);//a=1

        int b = a++;//a=1
        System.out.println(b);//a=2

        int c = ++a;//a=3
        System.out.println(c);

        //幂运算
        double pow = Math.pow(2,3);
        System.out.println(pow);
    }
}
