package com.baidu;

/**
 * 数据类型---整型
 * @author 刘明君
 * 2020-02-11
 */
public class ThirdSample {
    public static void main(String[] args) {
        // int
        int temp1 = 2147483647;
        System.out.println("int类型:"+temp1);
        // short类型
        short temp2 = 32767;
        System.out.println("short类型:"+temp2);
        // long类型(L写法)
        long temp3 =  9223372036854775807L;
        System.out.println("long类型:"+temp3);
        // long类型(l写法)
        long temp4 = 9223372036854775807l;
        System.out.println("long类型:"+temp4);
        // byte类型
        byte temp5 = 127;
        System.out.println("byte类型:"+temp5);
        // 整型 --- 十六进制
        int temp6 = 0x52415;
        System.out.println("十六进制写法："+temp6);
        // 整型----八进制
        int temp7 = 0210;
        System.out.println("八进制写法:"+temp7);
        // 整型 --- 二进制写法
        int temp8 = 0b11110;
        System.out.println("二进制写法:"+temp8);
    }
}
