package com.collection.Generic;

public class MyinterfaceImpl2<T> implements MyInterface<T> {

    @Override
    public T server(T t) {
        System.out.println(t);
        return t;
    }
}
