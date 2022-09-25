package com.collection.Generic;

public class MyinterfaceImpl implements MyInterface<String>{

    @Override
    public String server(String t) {
        System.out.println(t);
        return t;
    }
}
