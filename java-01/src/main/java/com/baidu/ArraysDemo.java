package com.baidu;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] array = {5,45,34,23,21,12};
        System.out.println("输出数组内的元素"+ Arrays.toString(array));
        System.out.println("输出拷贝之后数组的元素"+Arrays.toString(Arrays.copyOf(array,array.length)));
        System.out.println("输出拷贝之后数组的元素2"+Arrays.toString(Arrays.copyOfRange(array,3,5)));
        Arrays.sort(array);
        System.out.println("数组排序:"+Arrays.toString(array));
        System.out.println("二分查找数组所在位置:"+Arrays.binarySearch(array,23));
        Arrays.fill(array,2);
        System.out.println("将数组元素全部置位同一个元素："+Arrays.toString(array));
        int[] array1 = {5,45,34,23,21,12};
        int[] array2 = {5,45,34,23,21,12};
        System.out.println("比较两个数组元素相等："+Arrays.equals(array1,array2));
    }
}
