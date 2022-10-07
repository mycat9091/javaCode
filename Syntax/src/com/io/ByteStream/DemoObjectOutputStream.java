package com.io.ByteStream;

import com.io.IOStudent;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 使用ObjectOutputStream进行对象对象序列化
 * 要求：
 * - 序列化类必须要实现Serializable接口
 * - 序列化类中对象属性要求属性Serializable接口
 * - 序列化版本号ID，保证序列化的类和反序列化的类是同一个类
 * - 使用transient修饰属性，这个属性不能序列化
 * - 静态属性不能序列化
 * - 序列化多个对象可以使用集合实现
 */
public class DemoObjectOutputStream {
    public static void main(String[] args) throws Exception{

        //创建对象流
        FileOutputStream fos = new FileOutputStream("D:\\demo\\z.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //序列化(写入操作)
        IOStudent s1 = new IOStudent("张三",66);
        IOStudent s2 = new IOStudent("李四",99);
//        oos.writeObject(s1);
        ArrayList<IOStudent> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        oos.writeObject(list);


        //关闭
        oos.close();
        System.out.println("序列化完毕");
    }
}
