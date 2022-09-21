package com.commonClass.chapter06;

import java.math.BigDecimal;

public class Demo7 {
    public static void main(String[] args) {
        double d1 = 1.0;
        double d2 = 0.9;
        System.out.println(d1 - d2);
        System.out.println(d1 / d2);

        double result = (1.4-0.5)/0.9;
        System.out.println(result);

        double d3 = 1.0;
        double d4 = 2.1;
        System.out.println(d3-d4);
        System.out.println();

        //BigDecimal,大的浮点数精确计算
        BigDecimal bd1 = new BigDecimal("1.0");
        BigDecimal bd2 = new BigDecimal("0.9");
        //加法
        BigDecimal r1 = bd1.add(bd2);
        System.out.println(r1);

        //减法
        BigDecimal r2 = bd1.subtract(bd2);
        System.out.println(r2);

        //乘法
        BigDecimal r3 = bd1.multiply(bd2);
        System.out.println(r3);

        //除法
        BigDecimal r4 = new BigDecimal("1.4")
                .subtract(new BigDecimal("0.5"))
                .divide(new BigDecimal("0.9"));
        System.out.println(r4);

        BigDecimal r5 = bd1.divide(bd2,22,BigDecimal.ROUND_HALF_UP);
        System.out.println(r5);
    }
}
