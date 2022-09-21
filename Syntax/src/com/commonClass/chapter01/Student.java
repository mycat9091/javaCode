package com.commonClass.chapter01;

public class Student {

    private String name;
    private int age;
    public Student(){

    }
    public Student(String name,int age){
        super();
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

    //重写toString方法
//    public String toString(){
//
//        return name + ":" + age;
//
//    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    //重写equals方法

    @Override
    public boolean equals(Object obj) {
        //判断两个对象是否是同一个引用
        if (this==obj){
            return true;
        }
        //判断obj是否null
        if (obj==null){
            return false;
        }
        //判断是否是同一个类型
//        if (this.getClass()==obj.getClass()){}

        //instanceof 判断对象是否是某种类型
        if (obj instanceof Student){
            //强制类型转换
            Student s = (Student)obj;
            //比较数值
            if (this.name.equals(s.getName())&&this.age==s.getAge()){
                return true;
            }
        }
        return false;
    }

    //重写finalize方法


    @Override
    protected void finalize() throws Throwable {
        System.out.println(this.name + "对象被回收了");
    }
}
