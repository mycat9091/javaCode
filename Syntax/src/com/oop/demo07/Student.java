package com.oop.demo07;

//static
public class Student {
    public static int age;
    public double score;

    public void run(){

    }

    public static void go(){

    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.run();
        go();

    }
}

//    public static void main(String[] args) {
//
//        Student s1 = new Student();
//
//        System.out.println(Student.age);
//        //System.out.println(Student.score);//报错
//        System.out.println(s1.age);
//        System.out.println(s1.score);
//    }