package com.collection.Generic;

/**
 * 泛型类
 * 语法：类名<T>
 * T是类型占位符，表示一种引用类型，如果使用多个可用逗号隔开
 */
public class MyGeneric<T> {
    //使用泛型T
    //创建变量
    T t;
    //泛型作为方法的参数
    public void show(T t) {
        System.out.println(t);
    }
    //泛型作为方法的返回值
    public T getT() {
        return t;
    }
}
