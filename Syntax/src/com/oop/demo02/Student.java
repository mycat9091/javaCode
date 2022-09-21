package com.oop.demo02;

//学生类
public class Student {

    //属性：字段
    String name;
    int age;


    //方法
    public void study(){
        System.out.println(this.name+"在学习");
    }
}

/*类and方法
//一个项目应该只有一个main方法
public class Application {

    public static void main(String[] args) {

        //类：抽象的，需要实例化
        //类型实例化后会返回一个自己的对象
        //student对象就是一个Student类的具体实例
        Student xiaoming = new Student();
        Student xiaohong = new Student();

        xiaoming.name = "小明";
        xiaoming.age = 3;

        System.out.println(xiaoming.name);
        System.out.println(xiaoming.age);

        xiaohong.name = "小红";
        xiaohong.age = 3;

        System.out.println(xiaohong.name);
        System.out.println(xiaohong.age);
    }
}

 */