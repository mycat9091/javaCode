package com.vir_l.struct;

public class ForDemo05 {
    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50};//定义一个数组

        //遍历数组的元素

        for (int x:numbers){
            System.out.println(x);
        }

        System.out.println("=================================================================");

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
    }
}
