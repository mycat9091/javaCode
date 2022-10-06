package com.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * 使用ObjectInputStream实现反序列化(读取重构成对象)
 *
 */
public class DemoObjectInputStream {
    public static void main(String[] args) throws Exception{
        //创建一个对象流
        FileInputStream fis = new FileInputStream("D:\\demo\\z.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        //读取文件(反序列化)
//        IOStudent s =(IOStudent)ois.readObject();
//        IOStudent s2 = (IOStudent)ois.readObject();

        ArrayList<IOStudent> list = (ArrayList<IOStudent>)ois.readObject();
        //关闭
        fis.close();
        ois.close();
        System.out.println("End");
        System.out.println(list.toString());
    }
}
