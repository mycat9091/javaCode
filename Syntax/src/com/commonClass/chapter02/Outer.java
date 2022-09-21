package com.commonClass.chapter02;
//外部类
public class Outer {
    //实例变量
    private String name = "张三";
    private int age = 20;

    //内部类
    class Inner{
        private String address = "北京";
        private String phone = "110";

        public String name = "李四";

        //方法

        public void show(){
        //打印外部类的属性
        // 属性和外部类的属性名字相同加上Outer.this指向
        System.out.println(Outer.this.name);
        System.out.println(age);
        //打印内部类的中的属性
        System.out.println(address);
        System.out.println(phone);
    }
    }
}
