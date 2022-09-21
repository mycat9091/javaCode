package com.oop.demo02;

public class Person {

    //一个类即使什么都不写，它也会存在一个方法
    //显示的定义构造器

    String name;
    int age;
    //实例化初始值
    //1.使用new关键字，本质就是在调用构造器
    //2.用来初始化值

    //无参构造
    public Person(){
        //this.name = "Vir-l";
    }

    //有参构造：一旦定义了有参构造，无参构造必须显示定义
    public Person(String name){
        this.name = name;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

/*
public class Application {

    public static void main(String[] args) {

        //new 实例化了一个对象
        Person person = new Person("Coign");

        System.out.println(person.name);
    }
}

    构造器：
        1.和类名相同
        2.没有返回值
    作用：
        1.new 本质在调用构造方法
        2.初始化对象的值
    注意点：
        1.定义有参构造之后，然后想使用无参构造，显示的定义一个无参构造
    Alt + Insert

    this关键字用于引用方法或构造函数中的当前对象
 */