package com.vir_l.array;

public class ArrayDemo01 {
    //变量的类型     变量的名字   =   变量的值
    //数组类型

    public static void main(String[] args) {

        int[] nums;//定义数组

        nums = new int[10];//创建一个数组，数组里可以存储10个int类型数据

        //给数组元素赋值
        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;
        nums[3] = 4;
        nums[4] = 5;
        nums[5] = 6;
        nums[6] = 7;
        nums[7] = 8;
        nums[8] = 9;
        nums[9] = 10;

        //System.out.println(nums[9]);

        //计算数组的和
        int sum = 0;
        for (int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }

        System.out.println(sum);
    }
}
