package com.exception.demo01;

public class Test2 {
    public static void main(String[] args) {

        int a = 1;
        int b = 0;

        //快捷键 Ctrl+Alt+T
        try {
            System.out.println(a/b);
        } catch (Exception e) {
            throw new RuntimeException(e);//打印错误的栈信息
        } finally {
        }

    }
}
