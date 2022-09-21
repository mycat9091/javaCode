package com.oop.demo05;

public class Application {

    //静态的方法和非静态的方法区别很大
        //静态方法：方法的调用只和左边定义的数据有关
        //非静态：重写
    public static void main(String[] args) {


        A a = new A();
        a.test();//A

        //父类的引用指向了子类对象
        B b = new A();//子类重写了父类的方法
        b.test();//B

    }
}



//student.say();
//System.out.println(student.getMoney());



// Student student = new Student();
//
//        //student.test("V");
//
//        //student.test1();