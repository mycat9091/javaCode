package com.commonClass.chapter05;

public class Mouse implements Usb{
    @Override
    public void service() {
        System.out.println("连接成功，鼠标正在运行...");
    }
}
