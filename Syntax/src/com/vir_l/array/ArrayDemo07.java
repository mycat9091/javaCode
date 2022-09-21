package com.vir_l.array;

import java.util.Arrays;

public class ArrayDemo07 {
    public static void main(String[] args) {

        int[] a = {1,9,0,2,3};
        int[] sort = sort(a);
        System.out.println(Arrays.toString(sort));
    }

    //冒泡排序
    //1,比较数组中，两个相邻的元素，如果前一个数比后一个数大，则交换它们的位置
    //2,每一次比较，都会排序出一个最大或最小的数字；
    //3,下一轮可少进行一次排序；
    //4,依次循环，直至结束；
    public static int[] sort(int[] array){
        //临时变量
        int temp = 0;
        //外层循环，判断程序需要走多少次；
        for (int i = 0; i < array.length-1; i++){

            //通过flag标识位减少没有意义的比较
            boolean flag = false;

            //内层循环，比价判断两个数，如果前一个数比后一个数大，则交换位置
            for (int j = 0; j <array.length-1-i; j++){
                if (array[j+1]<array[j]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = true;
                }
            }

            if (flag==false){
                break;
            }
        }

        return array;
    }
}
