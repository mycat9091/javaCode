package com.commonClass.chapter07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo3 {
    public static void main(String[] args) throws Exception{

        //创建SimpleDateFormat
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        //创建Date
        Date date = new Date();
        //格式化date
        String str = sdf.format(date);
        System.out.println(str);

        //解析(把字符串转成日期)

        Date date2 = sdf.parse("1970/01/01");
        System.out.println(date2);
    }



}
