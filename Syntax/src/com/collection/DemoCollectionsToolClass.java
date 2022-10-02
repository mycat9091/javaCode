package com.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 演示Collections工具类的使用
 */
public class DemoCollectionsToolClass {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(6);
        list.add(9);
        list.add(12);
        list.add(5);
        //sort排序
        System.out.println("排序之前："+list.toString());
        Collections.sort(list);
        System.out.println("排序之后："+list.toString());
        //binarySearch,二分查找
        int i =Collections.binarySearch(list,12);
        System.out.println(i);
        //copy，复制
        List<Integer> dest = new ArrayList<>();
        for (int k = 0; k < list.size(); k++) {
            dest.add(0);
        }
        Collections.copy(dest,list);
        System.out.println(dest.toString());

        //reverse,反转
        Collections.reverse(list);
        System.out.println("反转之后："+list);

        //shuffle,打乱
        Collections.shuffle(list);
        System.out.println("打乱之后："+list);

        //补充
        //list转成数组
        System.out.println("list转成数组");
        Integer[] arr = list.toArray(new Integer[0]);
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));

        //数组转成集合
        System.out.println("数组转成集合");
        String[] name = {"aaa","bbb","ccc"};
        //集合是一个受限集合，不能添加和删除
        List<String> list1 = Arrays.asList(name);
        System.out.println(list1);

        //把基本类型数组转换成集合时，需要修改为包装类型
        Integer[] nums = {100,200,300,400,500};
        List<Integer> ints = Arrays.asList(nums);
        System.out.println(ints);

    }

}
