package com.vir_l.struct;

public class ForDemo04 {
    public static void main(String[] args) {
        //九九乘法表

        for (int i = 1; i <= 9; i++) {

            for (int j = 1;j <= i; j++){

                System.out.print(i+"*"+j+"="+(i*j)+"\t");
            }
            System.out.println();
        }

        System.out.println("====================================================================================");

        for (int i = 1; i <= 9; i++) {

            for (int j = 1;j <= i; j++){

                System.out.print(j+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }

    }
}
