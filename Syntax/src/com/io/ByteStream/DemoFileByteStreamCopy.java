package com.io.ByteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 使用文件字节流实现文件的复制
 */
public class DemoFileByteStreamCopy {
    public static void main(String[] args) throws Exception{

        //创建流
        FileInputStream fis = new FileInputStream("D:\\demo\\p1.png");
        FileOutputStream fos = new FileOutputStream("D:\\demo\\p2.png");
        //读写
        byte[] buf = new byte[1024];
        int count = 0;
        while ((count=fis.read(buf))!=-1) {
            fos.write(buf,0,count);
        }
        //关闭
        fis.close();
        fos.close();
        System.out.println("End");

    }
}
