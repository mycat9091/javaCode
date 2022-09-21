package com.exception.demo02;

//自定义的异常类
public class MyException extends Exception{

    //传递数值>10
    private int detai1;

    public MyException(int a){
        this.detai1 = a;
    }

    //toString：异常的打印信息

    @Override
    public String toString() {
        return "MyException{" + detai1 + '}';
    }
}
