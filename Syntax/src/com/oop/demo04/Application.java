package com.oop.demo04;

/*
1.提高程序的安全性，保护数据
2.隐藏代码的实现细节
3.统一接口
4.增加系统可维护性
 */
public class Application {
    public static void main(String[] args) {

        Studen s1 = new Studen();

        s1.setName("Vir-l");

        System.out.println(s1.getName());
        s1.setAge(-1);
        System.out.println(s1.getAge());
    }
}
