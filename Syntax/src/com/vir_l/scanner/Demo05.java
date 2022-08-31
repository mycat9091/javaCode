package com.vir_l.scanner;

import java.util.Scanner;

public class Demo05 {
    public static void main(String[] args) {
    //输入多个数字，求和与平均值，每次输入以回车确定，输入非数字终止输入并返回结果

        Scanner scanner = new Scanner(System.in);

        double sum = 0;

        int m = 0;

        System.out.println("请输入数字");

        while (scanner.hasNextDouble()){

            double x = scanner.nextDouble();
            m++;
            sum = sum + x;
            System.out.println("你输入了" + m + "个数字，当前和为" + sum);
            System.out.println("请输入数字");
        }

        System.out.println(m +"个数的和为" + sum);
        System.out.println(m +"个数的平均值为" + sum / m);
        scanner.close();
    }
}
