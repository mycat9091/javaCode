package com.io.ByteStream;

import java.io.FileOutputStream;

/**
 * 文件字节输出流的使用
 * FileOutputStream
 */
public class DemoFileOutputStream {
    public static void main(String[] args) throws Exception {

        //创建对象
        FileOutputStream fos = new FileOutputStream("D:\\demo\\b.txt",true);
        //写入文件
//        fos.write(97);
//        fos.write(98);
//        fos.write('c');
        String str = "Hello World";

        fos.write(str.getBytes());
        //关闭
        fos.close();
        System.out.println("End");
    }
}
