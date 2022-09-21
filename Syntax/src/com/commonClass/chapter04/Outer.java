package com.commonClass.chapter04;

public class Outer {

    private String name = "xvx";
    private int age = 99;

    public void show(){
        //定义局部变量
        final String address = "york";

        //局部内部类，注意不能加任何修饰符
        class Inner{

            //局部内部类的属性
            private String phone = "999";
            private String email = "1@qq.com";

            public void show2(){
                //访问外部类的属性
                System.out.println(Outer.this.name);
                System.out.println(Outer.this.age);
                //访问局部内部类的属性
                System.out.println(this.phone);
                System.out.println(this.email);
                //访问局部变量.jdk1.8自动添加final
                System.out.println(address);

            }
        }

        //创建局部内部类对象
        Inner inner = new Inner();
        inner.show2();
    }

}
