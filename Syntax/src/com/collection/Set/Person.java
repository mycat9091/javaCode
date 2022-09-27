package com.collection.Set;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public int compareTo(Person o) {
        int n1 = this.getName().compareTo(o.getName());
        int n2 = this.age-getAge();

        return n1==0 ? n2:n1;
    }

    //    @Override
//    public int hashCode() {
//        int n1 = this.name.hashCode();
//        int n2 = this.age;
//        return n1 + n2;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this==obj) {
//            return true;
//        }
//        if (obj==null) {
//            return false;
//        }
//        if (obj instanceof Person) {
//            Person p = (Person)obj;
//
//            if (this.name.equals(p.getName())&&this.age== p.getAge()){
//                return true;
//            }
//        }
//        return false;
//    }
}

