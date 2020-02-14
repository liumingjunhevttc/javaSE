package com.baidu.one;

/**
 * 位运算符
 * @author 刘明君
 * 2020-02-14
 */
public class FirstSample {
    public static void main(String[] args) {
        /*
           3:11
           2:10
             10  == 2
         */
        System.out.println("&:"+(3&2));
        /*
           4: 100
           2:  10
              110  == 6
         */
        System.out.println("|:"+(4|2));

        /**
         *  5 101
         *  2  10
         *    111 == 7
         */
        System.out.println("^"+(5^2));
        /*
            3: 011
               100
         */
        System.out.println("~"+(~-3));

        /*
            2:  10
                 01==1
         */
        System.out.println(">>"+(2>>1));
         /*
            2:  10
                01==1
         */
        System.out.println(">>>"+(2>>>1));
        /*
            2:  10
                100==4
         */
        System.out.println("<<"+(2<<1));
    }
}
