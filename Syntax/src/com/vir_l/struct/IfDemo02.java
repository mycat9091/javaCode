package com.vir_l.struct;

import java.util.Scanner;

public class IfDemo02 {
    public static void main(String[] args) {
        //考试是否及格
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入成绩：");

        int score = scanner.nextInt();

        if (score >= 60){
            System.out.println("及格");
        }else {
            System.out.println("不及格");
        }
    }
}
