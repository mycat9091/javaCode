package com.vir_l.struct;

public class ForDemo01 {
    public static void main(String[] args) {

        int a = 1;//初始化条件

        while (a<=100){//条件判断
            System.out.println(a);//循环体
            a+=1;//迭代
        }

        System.out.println("while END");

        for (int i = 0;i<=100;i++){
            System.out.println(i);
        }
        System.out.println("for END");


        //100.for +回车
        for (int i = 0; i < 100; i++) {

        }

        int f=0;
        for (;;f++){
            System.out.println("error");
        }
    }
}
