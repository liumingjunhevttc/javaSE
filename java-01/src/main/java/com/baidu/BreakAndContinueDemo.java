package com.baidu;

public class BreakAndContinueDemo {
    public static void main(String[] args) {
        // 实例1
        int i = 0;
        while(true){
            System.out.println(i);
            i++;
            if(i>10) break;
        }
        System.out.println("结束了");

        //实例2
        read_data:
        for(int k = 1;k<=9;k++){
            for(int j = 1;j<=k;j++){
                System.out.print(j+"*"+k+"="+(j*k)+"\t");
            }
            if(k==6) break read_data;
            System.out.println();
        }

        // 实例3
        for(i = 0;i<100;i++){
            if(i%2==0) continue;
            System.out.println(i);
        }
    }
}
