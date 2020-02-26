package com.baidu;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = new int[10];
        int b[] = new int[10];
        for(int i = 0;i<a.length;i++){
            a[i] = i;
        }
        System.out.println(Arrays.toString(a));
        // foreach
        for (int temp:a) {
            System.out.println(temp);
        }
        // 初始化
        int[] flag1 = {1,2,3};
        // 匿名数组
        int[] flag2 = new int[]{1,2,3};
        // 数组拷贝
        int[] flag3 = {1,2,3};
        int[] flag4 = flag3;

        // 使用copyOf方法执行数组拷贝
        int[] flag5 = Arrays.copyOf(flag3, flag3.length);
    }
}
