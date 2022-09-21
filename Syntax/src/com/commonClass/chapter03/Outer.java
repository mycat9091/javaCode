package com.commonClass.chapter03;

public class Outer {
    private String name = "xxx";
    private int age = 18;

    //静态内部类，级别和外部类相同
    static class Inner{

        private String address = "york";
        private String phone = "111";
        //静态成员
        private static int count = 999;

        public void show(){
            //调用外部类的属性
            //先创建外部类对象

            Outer outer = new Outer();
            //再来调用外部类属性
            System.out.println(outer.name);
            System.out.println(outer.age);
            //调用静态内部类对象的属性和方法
            System.out.println(address);
            System.out.println(phone);
            //调用静态内部类的静态属性
            System.out.println(Inner.count);
        }
    }
}
