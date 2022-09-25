package com.collection.Generic;

public class TestGeneric {
    public static void main(String[] args) {
        //使用泛型类创建对象
        //泛型只能使用引用类型，不同泛型类型对象之间不能互相赋值
        MyGeneric<String> myGeneric = new MyGeneric<>();
        myGeneric.t = "hello";
        System.out.println(myGeneric.t);
        myGeneric.show("hi");
        String string = myGeneric.getT();
        System.out.println(string);

        MyGeneric<Integer> myGeneric1 = new MyGeneric<>();
        myGeneric1.t = 99;
        myGeneric1.show(199);
        Integer integer = myGeneric1.getT();

//        MyGeneric<String> myGeneric3 = myGeneric1;

        //泛型接口
        MyinterfaceImpl impl = new MyinterfaceImpl();
        impl.server("xxxxxxx");

        MyinterfaceImpl2<Integer> impl2 = new MyinterfaceImpl2<>();
        impl2.server(999);

        //泛型方法

        MyMethod myMethod = new MyMethod();
        myMethod.show("str");
        myMethod.show(99);
        myMethod.show(3.14);
    }
}
