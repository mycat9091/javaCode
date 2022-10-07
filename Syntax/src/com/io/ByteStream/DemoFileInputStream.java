package com.io.ByteStream;

import java.io.FileInputStream;

/**
 *FileInputStream的使用
 * 文件字节输入流
 */
public class DemoFileInputStream {
    public static void main(String[] args) throws Exception {

        //创建FileInputSteam
        FileInputStream fis = new FileInputStream("D:\\demo\\a.txt");
        //读取
        //单字节读取
        System.out.println("单字节读取");
        fis.read();
        int data = 0;
        while ((data=fis.read())!=-1) {
            System.out.print((char) data + "\t");
        }
        fis.close();
        System.out.println("End");

        //多字节读取
        FileInputStream fis2 = new FileInputStream("D:\\demo\\a.txt");


        System.out.println("多字节读取");
//        byte[] buf = new byte[3];
//        int count = fis2.read(buf);
//        System.out.println(new String(buf));
//        System.out.println(count);
//        int count2 = fis2.read(buf);
//        System.out.println(new String(buf));
//        System.out.println(count2);

        byte[] buf = new byte[1024];
        int count = 0;
        while ((count=fis2.read(buf))!=-1) {
            System.out.println(new String(buf,0,count));
        }

        fis2.close();
        System.out.println("End");


    }
}
