package com.vir_l.basic;

public class demo03 {
    public static void main(String[] args) {
        //整数拓展
        int i2 = 0b10;
        int i8 = 010;
        int i10 = 10;
        int i16 = 0x10;
        System.out.println(i2);
        System.out.println(i8);
        System.out.println(i10);
        System.out.println(i16);
        System.out.println("===========================================================================");
        //=============================
        //浮点数拓展
        float ft = 0.1f;
        double dl =1.0/10;
        System.out.println(ft==dl);
        float d1 = 212121242312312f;
        float d2 = d1 + 1;
        System.out.println(d1==d2);
        System.out.println("===============================================================================");
        //字符拓展
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int)c1);
        System.out.println(c2);
        System.out.println((int)c2);
        char c3 = '\u0061';
        System.out.println(c3);
        System.out.println("===========================================================================");
        //布尔值拓展
        boolean flag = true;
        if (flag==true){}
        if (flag){}

    }
}
