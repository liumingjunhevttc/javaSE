package com.baidu;

public class MethodParamsDemo {
    private String name=null;
    public static void main(String[] args) {
//        int i = 10;
//        add(i);
//        System.out.println(i);
        MethodParamsDemo methodParamsDemo = new MethodParamsDemo();
        methodParamsDemo.name="张三";
        System.out.println(methodParamsDemo.name);
        edit(methodParamsDemo);
        System.out.println(methodParamsDemo.name);
    }

    public static void edit(MethodParamsDemo name){
        name.name="李四";
        System.out.println(name.name);
    }

    public static void add(int i){
        i=i+20;
    }
}
