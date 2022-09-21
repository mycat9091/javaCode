package com.commonClass.chapter06;
/*
    StringBuffer
    StringBuilder
 */
public class Demo5 {
    public static void main(String[] args) {

        //作用相同

        //StringBuffer sb = new StringBuffer();
        StringBuilder sb = new StringBuilder();
        //append();追加
        sb.append("java世界第一");
        System.out.println(sb.toString());
        sb.append("java真香");
        System.out.println(sb.toString());
        sb.append("java针不戳");
        System.out.println(sb.toString());

        //insert();添加
        sb.insert(0,"我在最前面");
        System.out.println(sb.toString());

        //replace();替换
        sb.replace(0,5,"hello");
        System.out.println(sb.toString());

        //delete();删除
        sb.delete(0,5);
        System.out.println(sb.toString());
        //清空
        sb.delete(0,sb.length());
        System.out.println(sb.length());
    }
}
