package com.collection.Generic;

/**
 * 泛型接口
 * 语法，接口名<T>
 * 注意：不能泛型静态常量
 */
public interface MyInterface<T> {

    String name = "AAA";
    T server(T t);
}
