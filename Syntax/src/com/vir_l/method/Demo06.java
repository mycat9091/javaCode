package com.vir_l.method;

public class Demo06 {
    //2! 2*1
    //3! 3*2*1
    public static void main(String[] args) {

        System.out.println(f(10));

    }

    public static int f(int n){

        if (n==1){
            return 1;
        }else {
            return n*f(n-1);
        }
    }
}
