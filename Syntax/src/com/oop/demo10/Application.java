package com.oop.demo10;

public class Application {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //通过外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getId();
    }
}
