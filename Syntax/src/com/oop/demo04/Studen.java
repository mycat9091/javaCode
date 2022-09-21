package com.oop.demo04;

//类 private
public class Studen {

    //属性私有
    //名字
    //学号
    //性别
    //年龄
    private String name;
    private int id;
    private char sex;
    private int age;

    //提供一些可以操作这个属性的方法！
    //提供一些public的get、set方法

    //get 获取这个数据
    public String getName(){
        return this.name;
    }

    //给这个数据设置值
    public void setName(String name){
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //不合法
        if (age>120 || age<0){
            this.age = 3;
        }else {
            this.age = age;
        }

    }
}
