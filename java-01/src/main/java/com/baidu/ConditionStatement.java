package com.baidu;

public class ConditionStatement {
    public static void main(String[] args) {
        int num = 0;
        if(num == 1)
            System.out.println("我就是李小龙");
        System.out.println("单行语句能否执行");

        if(num == 0){
            System.out.println("我就是周润发");
            System.out.println("多行语句能否执行");
        }



        int flag1 = 1;
        if(flag1 == 1){
            System.out.println("我是1");
        } else {
            System.out.println("我不是1");
        }

        int score = 90;
        if(score>90)
        {
            System.out.println("优秀");
        } else  if (score >80){
            System.out.println("一般");
        } else {
            System.out.println("很差");
        }
    }
}
