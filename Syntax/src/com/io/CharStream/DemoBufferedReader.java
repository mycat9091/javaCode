package com.io.CharStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.Buffer;

/**
 * 使用字符缓冲流读取文件
 * BufferedReader
 */
public class DemoBufferedReader {
    public static void main(String[] args) throws Exception{

        //创建字符缓冲流
        FileReader fr = new FileReader("D:\\demo\\z.txt");
        BufferedReader br = new BufferedReader(fr);
        //读取
        ///全部读取
//        char[] buf = new char[1024];
//        int count = 0;
//        while ((count= br.read(buf))!=-1) {
//            System.out.print(new String(buf,0,count));
//        }
        ///单行读取
        String line = null;
        while ((line=br.readLine())!=null) {
            System.out.println(line);
        }
        //关闭
        br.close();
    }
}
