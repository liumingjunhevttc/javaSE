package com.baidu;

/**
 * 循环
 */
public class CyCleDemo {
    public static void main(String[] args) {
        // while循环
        int temp = 0;
        while(temp<=10){
            System.out.println(temp);
            temp++;
        }

        // do  while循环
        int flag1 = 0;
        do{
            System.out.println(flag1);
            flag1++;
        }while (flag1<0);
    }
}
