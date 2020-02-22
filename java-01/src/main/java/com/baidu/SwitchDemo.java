package com.baidu;

import java.util.Scanner;

/**
 * switch语句
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int flag = 52;
        switch (flag){
            case 1:{
                System.out.println("我是一号嘉宾");
                break;
            }
            case 2:{
                System.out.println("我是二号嘉宾");
                break;
            }
            default:{
                System.out.println("我是场外人员");
                break;
            }
        }

        int flag2 = 1;
        switch (flag2){
            case 1:{
                System.out.println("我是一号嘉宾");
            }
            case 2:{
                System.out.println("我是二号嘉宾");
            }
            default:{
                System.out.println("我是场外人员");
            }
        }
    }
}
