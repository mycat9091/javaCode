package com.vir_l.operator;

//三元运算符
public class Demo08 {
    public static void main(String[] args) {
        // x ? y : z
        //如果X==true，则结果为y，否则为z
        int score = 60;
        String type = score <60 ? "不及格" : "及格";
        System.out.println(type);
    }
}
