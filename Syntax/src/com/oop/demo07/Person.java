package com.oop.demo07;

public class Person {
    {
        //代码块(匿名代码块)@
        System.out.println("匿名代码块");
    }

    static {
        //静态代码块(只执行一次)#1
        System.out.println("静态代码块");
    }

    public Person() {
        //构造器 #3
        System.out.println("构造方法");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println("===================================");
        Person person2 = new Person();
    }
}
