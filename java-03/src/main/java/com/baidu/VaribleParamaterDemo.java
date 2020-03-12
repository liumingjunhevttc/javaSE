package com.baidu;

public class VaribleParamaterDemo {
    public static void main(String[] args) {
        System.out.println(add(1,2,5));
    }
    public static Integer add(Integer... obj){
        Integer result = 0;
        for(Integer temp:obj){
            result+=temp;
        }
        return result;
    }
}
