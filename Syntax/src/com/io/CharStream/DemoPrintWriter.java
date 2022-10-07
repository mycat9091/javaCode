package com.io.CharStream;

import java.io.PrintWriter;

/**
 * PrintWriter的使用
 */
public class DemoPrintWriter {
    public static void main(String[] args) throws Exception{
        //创建打印流
        PrintWriter pw = new PrintWriter("D:\\demo\\z.txt");
        //打印
        pw.println(97);
        pw.println(true);
        pw.println(3.14);
        pw.println('A');
        //关闭
        pw.close();
        System.out.println("End");
    }


}
