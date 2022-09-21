package com.oop.demo01;

//引用传递：传递对象，本质还是值传递
public class Demo05 {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.name);//null

        Demo05.change(person);
        System.out.println(person.name);
    }

    public static void change(Person person){
        //person是一个对象：指向---> Person person = new Person();
        person.name = "Vir-l";
    }

}

//定义了一个Person类，有一个属性：name
class Person{
    String name;
}
