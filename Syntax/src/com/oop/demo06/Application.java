package com.oop.demo06;


public class Application {

    public static void main(String[] args) {
        //类型之间的转化：父 子
        //高 --》低  强制转换

        //Person obj = new Student();

        //Student student = (Student) obj;
        //student.go();
        //((Student)obj).go();

        //子类转换为父类，可能会丢失自己本来的一些方法
        Student student = new Student();
        student.go();
        Person person = student;


    }
}

//    public static void main(String[] args) {
//
//        Object object = new Student();
//
//        System.out.println(object instanceof Student);
//        System.out.println(object instanceof Person);
//        System.out.println(object instanceof Object);
//        System.out.println(object instanceof Teachor);
//        System.out.println(object instanceof String);
//
//        System.out.println("=====================================================");
//
//        Person person = new Student();
//        System.out.println(person instanceof Student);
//        System.out.println(person instanceof Person);
//        System.out.println(person instanceof Object);
//        System.out.println(person instanceof Teachor);
//        //System.out.println(person instanceof String);//编译报错，Person与String同级
//
//        System.out.println("=====================================================");
//
//        Student student = new Student();
//        System.out.println(student instanceof Student);
//        System.out.println(student instanceof Person);
//        System.out.println(student instanceof Object);
//        //System.out.println(student instanceof Teachor);//编译报错，同级
//        //System.out.println(student instanceof String);//编译报错，无继承关系











//    //一个对象的实际类型是确定的
//    Student student = new Student();
//    Person person = new Person();
//
//    //可以指向的引用类型就不确定了
//
//    //Student 能调用的方法都是自己的和继承父类的
//    Student s1 = new Student();
//    //父类的引用类型指向子类的实际类型
//    //Person 父类引用类型，可以指向子类的实际类型，但不能调用子类独有的方法
//    Person s2 = new Student();
//    Object s3 = new Student();
//
//        s2.run();//子类重写了父类的方法，执行子类的方法
//                s1.run();
//
//                //对象能执行哪些方法。主要看左边的类型，与右边关系不大
//                //s2.eat();
//                s1.eat();