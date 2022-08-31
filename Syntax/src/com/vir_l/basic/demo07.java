package com.vir_l.basic;

public class demo07 {

    //类变量 static
    static double salary = 2500;

    //属性：变量

    //实例变量：从属于对象，如果不自行初始化会变为这个类型的默认值
    //布尔值：默认是false
    //除了基本类型，其余的默认值都是null
    String name;
    int age;

    //main方法
    public static void main(String[] args) {

        //局部变量：必须声明和初始化
        int i = 1;
        System.out.println(i);

        //变量类型 变量名字 = new 变量名字();
        demo07 demo07 = new demo07();
        System.out.println(demo07.age);
        System.out.println(demo07.name);
        System.out.println(salary);
    }
    //其他变量
    public void add(){

    }
}
