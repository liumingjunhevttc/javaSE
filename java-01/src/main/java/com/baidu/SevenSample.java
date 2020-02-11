package com.baidu;

/**
 *   常量
 * @author 刘明君
 * 2020-02-11
 */
public class SevenSample {
    public static final String DATANAME = "localhost:3306";
    public static void main(String[] args) {
        System.out.println("main:"+DATANAME);
        test1();
    }
    public static void test1(){
        System.out.println("test1:"+DATANAME);
    }
}
