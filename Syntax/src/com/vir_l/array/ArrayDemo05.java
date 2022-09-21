package com.vir_l.array;

public class ArrayDemo05 {
    public static void main(String[] args) {

        int[][] array = {{1,2},{2,3},{3,4},{4,5}};

//        printArray(array[0]);
//        System.out.println(array[0][0]);
//        System.out.println(array[1][0]);
//        System.out.println(array.length);
//        System.out.println(array[0].length);
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    //打印数组元素
    public static void printArray(int[] arrays){

        for (int i = 0; i < arrays.length; i++){
            System.out.println(arrays[i]+" ");
        }

    }
}
