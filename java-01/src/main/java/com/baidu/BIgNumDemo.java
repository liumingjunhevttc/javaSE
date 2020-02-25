package com.baidu;

import java.math.BigDecimal;

public class BIgNumDemo {
    public static void main(String[] args) {
        // 实例1
        int a = 1000;
        BigDecimal decimal = BigDecimal.valueOf(a);
        System.out.println(decimal);
        // 实例2
        BigDecimal bigDecimal = new BigDecimal(100);
        BigDecimal bigDecimal1 = new BigDecimal(3);
        System.out.println(bigDecimal.multiply(bigDecimal1));

        // 实例3
        System.out.println("加法:"+bigDecimal.add(bigDecimal1));
        System.out.println("减法:"+bigDecimal.subtract(bigDecimal1));
        System.out.println("乘法:"+bigDecimal.multiply(bigDecimal1));
        System.out.println("除法:"+bigDecimal1.divide(bigDecimal));
        System.out.println("比较:"+bigDecimal.compareTo(bigDecimal1));
    }
}
