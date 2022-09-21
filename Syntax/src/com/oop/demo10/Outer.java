package com.oop.demo10;

public class Outer {

    //局部内部类
    public void method(){
        class M{
            public void im(){

            }
        }
    }

    private int id;
    public void out(){
        System.out.println("外部类");
    }

    class Inner{
        public void in(){
            System.out.println("内部类");
        }

        //获得外部类的私有属性
        public void getId(){
            System.out.println(id);
        }
    }
}

//一个java类中可以有多个class类，但是只能有一个public class类
//class A{
//    public static void main(String[] args) {
//
//    }
//
//}
