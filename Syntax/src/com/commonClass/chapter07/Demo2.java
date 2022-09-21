package com.commonClass.chapter07;

import java.util.Calendar;

public class Demo2 {
    public static void main(String[] args) {
        //创建Calendar对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime().toLocaleString());
        System.out.println(calendar.getTimeInMillis());
        //获取时间信息
        //获取年
        int year = calendar.get(Calendar.YEAR);
        //月
        int month = calendar.get(Calendar.MONTH);
        //日
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        //小时,HOUR12小时制，HOUR_OF_DAY24小时制
        int hour = calendar.get(Calendar.HOUR_OF_DAY);
        //分钟
        int minute = calendar.get(Calendar.MINUTE);
        //秒
        int second = calendar.get(Calendar.SECOND);
        System.out.println(year+"年"+(month+1)+"月"+day+"日"+" "+hour+":"+minute+":"+second);
        //修改时间
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(Calendar.DAY_OF_MONTH, 16);
        System.out.println(calendar2.getTime().toLocaleString());

        //add方法修改时间
        calendar2.add(Calendar.MONTH,1);
        System.out.println(calendar2.getTime().toLocaleString());

        //补充
        int max = calendar2.getActualMaximum(Calendar.DAY_OF_MONTH);
        int min = calendar2.getActualMinimum(Calendar.DAY_OF_MONTH);
        System.out.println(max);
        System.out.println(min);
    }
}
