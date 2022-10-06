package com.io;

import java.io.Serial;
import java.io.Serializable;

/**
 * 学生类
 */
public class IOStudent implements Serializable {

    @Serial
    private static final long serialVersionUID = 1001L;
    private String name;
    private int age;

    public IOStudent() {
    }

    public IOStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "IOStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
