package com.commonClass.chapter07;

import java.util.Arrays;

public class Demo4 {
    public static void main(String[] args) {

        //arraycopy;数组的复制
        //src：原数组
        //srcPos：从哪个位置开始复制
        //dest：目标数组
        // destPos:目标数组的放置位置
        //length：复制的长度

        int[] arr = {20,30,24,22,13};
        int[] dest = new int[5];
        System.arraycopy(arr,2,dest,2,3);
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }

        //Arrays.copyOf(original,newLength);
        int[] test = Arrays.copyOf(arr,7);
        for (int i = 0; i < test.length; i++) {
            System.out.print(test[i]+" ");
        }
        System.out.println();

        //System.currentTimeMillis();获取毫秒数
        System.out.println(System.currentTimeMillis());
        long start = System.currentTimeMillis();
        for (int i = 0; i < 9999999; i++) {
            for (int j = 0; j < 999999; j++) {
                int result = i + j;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("用时：" + (end - start));

        //System.gc();建议JVM进行垃圾回收

        new Student("aaa",18);
        new Student("bbb",19);
        new Student("ccc",19);
        new Student("ddd",19);
        new Student("eee",19);
        new Student("fff",19);

        System.gc();

        //System.exit();退出JVM
        System.exit(0);
        System.out.println("程序结束了");
    }
}
