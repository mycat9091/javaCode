package com.oop.demo09;

//抽象的思维

//interface 定义的关键字，接口需要类现实
public interface UserService {

    //接口中的所有定义都是抽象的 public abstract

    //常量
    int age = 99;

    void add(String name);
    void delete(String name);
    void updata(String name);
    void query(String name);
}
