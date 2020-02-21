package com.baidu.stringdemo;

public class Demo2 {
    public static void main(String[] args) {
        String str1 = "hello java world";
        System.out.println("得到某个位置的代码单元:"+str1.charAt(1));
        System.out.println("返回指定位置的码点:"+str1.codePointAt(0));
        System.out.println("返回从某个位置开始，位移之后的码点索引"+str1.offsetByCodePoints(1,2));
        System.out.println("比较两个字符串的大小:"+str1.compareTo("hello"));
        System.out.println("将字符串的码点作为一个流返回。调用toArray方法将他们放在一个数组中:"+str1.codePoints());
        System.out.println("判断两个字符串是否相等:"+str1.equals("hello java world"));
        System.out.println("忽略大小写判断两个字符串是否相等:"+str1.equalsIgnoreCase("HELLO JAVA WORLD"));
        System.out.println("判断是否以某个字符串开头:"+str1.startsWith("hello"));
        System.out.println("判断是否以某个字符串结尾:"+str1.endsWith("world"));
        System.out.println("查找某个字符串在主字符串所在位置:"+str1.indexOf("o"));
        System.out.println("查找某个字符串在主字符串所在位置:"+str1.indexOf("o",5));
        System.out.println("字符串的长度:"+str1.length());
        System.out.println("替换某个字符串:"+str1.replace('l','h'));
        System.out.println("从某个位置开始截取"+str1.substring(2));
        System.out.println("从某个位置开始截取到相应位置"+str1.substring(2,4));
        System.out.println("小写转大写:"+str1.toUpperCase());
        System.out.println("大写转小写:"+str1.toLowerCase());
        System.out.println("用某个分割符连接字符串"+String.join("&","a","b"));
    }
}
