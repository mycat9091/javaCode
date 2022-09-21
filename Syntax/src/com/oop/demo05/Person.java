package com.oop.demo05;

// 父类
public class Person {

    public Person() {
        System.out.println("Person无参执行");
    }

    protected String name = "P";

    public void print(){
        System.out.println("Person");
    }
}



//public
//protected
//default
//private
//    private
//    int money = 1_0000;
//    public void say(){
//        System.out.println("test");
//    }
//
//    public int getMoney() {
//        return money;
//    }
//
//    public void setMoney(int money) {
//        this.money = money;
//    }