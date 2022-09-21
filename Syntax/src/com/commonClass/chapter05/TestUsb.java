package com.commonClass.chapter05;

public class TestUsb {
    public static void main(String[] args) {

        //创建接口类型的变量
//        Usb usb = new Mouse();
//        usb.service();

        //局部内部类
//        class Fan implements Usb{
//            @Override
//            public void service() {
//                System.out.println("连接成功，风扇正在运行...");
//
//            }
//        }

        //使用局部内部类创建对象
//        Usb usb = new Fan();
//        usb.service();

        //使用匿名内部类优化(相当于创建了一个局部内部类)
        Usb usb = new Usb(){
            @Override
            public void service() {
                System.out.println("连接成功，风扇正在运行...");

            }
        };
        usb.service();
    }
}
