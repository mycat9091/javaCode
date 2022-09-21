package com.vir_l.test;

import java.util.Scanner;

public class Calc {
    //定义
    public static float a;
    public static float b;


    public static void main(String[] args) {
        //数据接收
        System.out.println("请输入第一个数：");
        Scanner scanner1 = new Scanner(System.in);
        a = scanner1.nextFloat();

        System.out.println("请选择运算符 (+,-,*./)：");
        Scanner scanner3 = new Scanner(System.in);
        String c = scanner3.next();

        System.out.println("请输入第二个数：");
        Scanner scanner2 = new Scanner(System.in);
        b = scanner2.nextFloat();

        //交互

        while (true) {

            //拉起调用方法输出
            float call = call(a,b,c);
            a = call;
            System.out.println("继续输入运算符进行运算 or 输入Q/q，退出程序...");

            c = scanner3.next();
            if (c.equals("Q")){
                break;
            }
            if (c.equals("q")){
                break;
            }

            System.out.println("请输入数据...");
            b = scanner2.nextFloat();


        }


    }

    //调用方法
    public static float call(float a,float b,String c){

        switch (c) {
            case "+":
                System.out.println("运算结果为：" + add(a, b));
                return add(a,b);
            case "-":
                System.out.println("运算结果为：" + sub(a, b));
                return sub(a,b);
            case "*":
                System.out.println("运算结果为：" + mul(a, b));
                return mul(a,b);
            case "/":
                System.out.println("运算结果为：" + div(a, b));
                return div(a,b);
            default:
                System.out.println("非法输入");
                return 0;
        }

    }

    //运算方法
    public static float add(float a, float b){
        return a + b;
    }
    public static float sub(float a, float b){
        return a - b;
    }
    public static float mul(float a, float b){
        return a * b;
    }
    public static float div(float a, float b){
        return a / b;
    }
}
