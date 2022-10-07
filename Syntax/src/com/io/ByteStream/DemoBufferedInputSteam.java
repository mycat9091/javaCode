package com.io.ByteStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

/**
 * 使用字节缓冲流
 * BufferedInputSteam
 */
public class DemoBufferedInputSteam {
    public static void main(String[] args) throws Exception{

        //创建BufferedInputSteam
        FileInputStream fis = new FileInputStream("D:\\demo\\a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);
        //读取
//        int data = 0;
//        while ((data=bis.read())!=-1) {
//            System.out.print((char) data+"\t");
//        }

        //
        byte[] buf = new byte[1024];
        int count = 0;
        while ((count=bis.read(buf))!=-1) {
            System.out.println(new String(buf,0,count));
        }
        //关闭
        fis.close();
        bis.close();
    }
}
