package com.vir_l.method;

public class Demo04 {
    public static void main(String[] args) {

        Demo04 demo04 = new Demo04();
        demo04.test(1,2);
    }
    public void test(int... i){
        System.out.println(i[0]);
        System.out.println(i[1]);
    }
}
