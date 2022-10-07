package com.io.CharStream;

import java.io.FileReader;

/**
 * 使用FileReader读取文件
 */
public class DemoFileReader {
    public static void main(String[] args) throws Exception{
        //创建FileReader 文件字符输入流
        FileReader fr = new FileReader("D:\\demo\\z.txt");
        //读取
        ///单字符读取
//        int data = 0;
//        while ((data=fr.read())!=-1) {
//            System.out.println((char) data);
//        }
        ///多字符读取
        char[] buf = new char[1024];
        int count = 0;
        while ((count=fr.read(buf))!=-1) {
            System.out.print(new String(buf,0,count));
        }
        //关闭
        fr.close();
    }
}
