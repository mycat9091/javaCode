package com.commonClass.chapter02;

import com.commonClass.chapter02.Outer.Inner;

public class TestOuter {
    public static void main(String[] args) {

//        //创建外部类对象
//        Outer outer = new Outer();
//        //创建内部类对象
//        Inner inner = outer.new Inner();

        //一步到位
        Inner inner = new Outer().new Inner();

        inner.show();

    }
}
