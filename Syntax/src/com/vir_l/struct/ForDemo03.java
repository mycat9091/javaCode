package com.vir_l.struct;

public class ForDemo03 {
    public static void main(String[] args) {
        //用while或for循环输出1~1000之间能被5整除的数，并且每行输出3个


        for (int i = 0; i <= 1000; i++) {
            if (i%5==0){
                System.out.print(i+"\t");

            }
            if (i%(5*3)==10){//10%15==10 25%15==10 40%(15*2)==10
                System.out.println();

            }

        }
    }
}
