package com.oop.demo05;

//学生 is 人
public class Student extends Person{

    public Student() {
        //隐藏代码：调用了父类的无偿构造
        super();//调用了父类的构造器，必须要在子类构造器的第一行
        System.out.println("Student无参执行");

    }

    private String name = "S";

    public void print(){
        System.out.println("Student");
    }

    public void test1(){
        print();
        this.print();
        super.print();
    }



    public void test(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);
    }
}
