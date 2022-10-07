package com.io.CharStream;

import java.io.FileWriter;

/**
 * 使用FileWriter写入文件
 */
public class DemoFileWriter {
    public static void main(String[] args) throws Exception{

        //创建FileWriter文件字符输出流
        FileWriter fw = new FileWriter("D:\\demo\\z.txt");
        //写入
        for (int i = 0; i < 10; i++) {
            fw.write("Java是世界上最好的语言\t\n");
            fw.flush();

        }
        //关闭
        fw.close();
        System.out.println("End");

    }
}
