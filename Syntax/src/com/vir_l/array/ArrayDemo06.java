package com.vir_l.array;

import java.util.Arrays;

public class ArrayDemo06 {
    public static void main(String[] args) {

        int[] a = {1,2,3,4,45456,6464,466474,21,12};

        //System.out.println(a);
        //打印数组元素Arrays.toString
        //System.out.println(Arrays.toString(a));
        printArray(a);

        //数组进行排序
        Arrays.sort(a);
        printArray(a);

        //数组进行填充
        Arrays.fill(a,0);
        printArray(a);

        Arrays.fill(a,2,5,1);
        printArray(a);
    }

    public static void printArray(int[] a){
        for (int i = 0; i < a.length; i++){

            if (i==0){
                System.out.print("[");
            }
            System.out.print(a[i]+",");

            if (i==a.length-1) {
                System.out.println("]");
            }
        }
    }
}
