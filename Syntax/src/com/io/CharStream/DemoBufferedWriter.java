package com.io.CharStream;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * BufferedWriter
 */
public class DemoBufferedWriter {
    public static void main(String[] args) throws Exception{

        //创建BufferedWriter
        FileWriter fw = new FileWriter("D:\\demo\\z.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        //写入
        for (int i = 0; i < 10; i++) {
            bw.write("好好学习，天天向上");
            bw.newLine();//写入一个换行符
            bw.flush();
        }
        //关闭
        fw.close();
        bw.close();
        System.out.println("End");
    }
}
