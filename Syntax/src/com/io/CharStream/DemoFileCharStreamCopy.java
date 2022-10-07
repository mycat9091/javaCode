package com.io.CharStream;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * 使用FileReader和FileWriter复制文本文件，不能复制图片或二进制文件
 */
public class DemoFileCharStreamCopy {
    public static void main(String[] args) throws Exception{
        //创建字符流
        FileReader fr = new FileReader("D:\\demo\\z.txt");
        FileWriter fw = new FileWriter("D:\\demo\\z_2.txt");
        //读写
        int data = 0;
        while ((data=fr.read())!=-1) {
            fw.write(data);
            fw.flush();
        }
        //关闭
        fr.close();
        fw.close();
        System.out.println("End");
    }
}
