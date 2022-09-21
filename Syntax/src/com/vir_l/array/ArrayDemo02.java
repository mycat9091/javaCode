package com.vir_l.array;

public class ArrayDemo02 {
    public static void main(String[] args) {
        //静态初始化
        int[] a = {1,2,3,4,5};

        System.out.println(a[0]);
        //Man[] mans = {new Man(),new Man()};

        //动态初始化
        int[] b = new int[10];

        System.out.println(b[0]);
        System.out.println(b[1]);

        String[] c = new String[5];

        System.out.println(c[1]);

    }


}

