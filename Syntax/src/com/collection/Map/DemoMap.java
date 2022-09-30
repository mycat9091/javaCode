package com.collection.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map接口的使用
 * 特点：存储键值对、键不能重复，值可以重复、无序
 */
public class DemoMap {

    public static void main(String[] args) {
        //创建Map集合
        Map<String,String> map = new HashMap<>();
        //添加元素
        map.put("cn","中国");
        map.put("uk","英国");
        map.put("us","美国");
        map.put("us","美利坚");
        System.out.println("元素个数："+map.size());
        System.out.println(map.toString());

        //删除
//        map.remove("us");
//        System.out.println("删除之后："+map.size());

        //遍历
        //使用KeySet
        System.out.println("使用KeySet()");
//        Set<String> keyset = map.keySet();
//        for (String key : keyset) {
        for (String key : map.keySet()) {
            System.out.println(key+"-----"+map.get(key));
        }
        //使用entrySet
        System.out.println("使用entrySet()");
//        Set<Map.Entry<String,String>> entries = map.entrySet();
//        for (Map.Entry<String,String> entry : entries) {
        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"-------"+entry.getValue());
        }
//        Set<Map.Entry<String, String>> entry = map.entrySet();
//        System.out.println(entry);
    }
}


