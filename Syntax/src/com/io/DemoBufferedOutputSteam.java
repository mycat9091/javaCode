package com.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * 使用字节缓冲流
 * BufferedOutputSteam
 */
public class DemoBufferedOutputSteam {
    public static void main(String[] args) throws Exception{

        //创建字节输出缓冲流
        FileOutputStream fos = new FileOutputStream("D:\\demo\\z.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        //写入文件
//        for (int i = 0; i < 10; i++) {
//            bos.write("HelloWorld\r\n".getBytes());//先写入8k缓冲区
//            bos.flush();
//        }
        for (int i = 0; i < 999999 ; i++) {
            bos.write("HelloWorld".getBytes());//先写入8k缓冲区
            bos.flush();
            System.out.println(i);
        }
        //关闭
        fos.close();
        bos.close();
    }
}
