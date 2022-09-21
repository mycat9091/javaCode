package com.commonClass.chapter06;

/**
 * StringBuilder效率高于String
 */
public class Demo6 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
//        String string = " ";
//        for (int i = 0; i < 99999; i++) {
//            string += 1;
//        }
//        System.out.println(string);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 99999; i++) {
            sb.append(1);
        }
        System.out.println(sb.toString());
        long end = System.currentTimeMillis();
        System.out.println("用时：" + (end - start));
    }
}
