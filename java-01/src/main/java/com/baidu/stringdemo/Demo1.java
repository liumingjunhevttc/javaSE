package com.baidu.stringdemo;

public class Demo1 {
    public static void main(String[] args) {
        String s= ""; // 是一个空字符串
        String greeting = "hello";
//        subStringdemo(greeting);
//        spliceString();
//        equalsString();
//        nullString();
        codeAndSymbols();
    }

    /**
     * 码点与码元
     */
    private static void codeAndSymbols() {
        String str = "hallo";
        System.out.println(str.length());
        System.out.println(str.codePointCount(0,str.length()));
        System.out.println(str.charAt(2));
        int i = str.offsetByCodePoints(0, 1);
        System.out.println(i);
        System.out.println(str.codePointAt(i));
    }

    /**
     * 空串以及null串
     */
    private static void nullString() {
        System.out.println("".equals("liumingjun"));
        String str = null;
        System.out.println(str == null);
    }

    /**
     * 比较字符串是否相等
     */
    private static void equalsString() {
        System.out.println("hello".equals("student"));
        System.out.println("student".equals("student"));
        System.out.println("ABC".equalsIgnoreCase("abC"));
    }

    /**
     * 拼接子字符串
     */
    private static void spliceString() {
        String welcome = "欢迎";
        String student = "小王";
        String showData = welcome+" "+student;
        System.out.println(showData);
    }

    /**
     * subString 方法截取
     * @param greeting
     */
    private static void subStringdemo(String greeting) {
        // 只定义开始
        String childGreeting = greeting.substring(2);
        System.out.println(childGreeting);
        //给开始和结束定义了区间
        childGreeting = greeting.substring(1, 3);
        System.out.println(childGreeting);
    }
}
