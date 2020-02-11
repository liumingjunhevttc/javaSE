package com.baidu;

/**
 * 基本数据类型  字符类型
 * @author 刘明君
 * 2020-02-11
 */
public class FiveSample {
    public static void main(String[] args) {
        /*
            转义字符
         */
        // 退格
        char temp1 = '\b';
        System.out.println("退格:"+temp1);
        //制表
        char temp2 = '\t';
        System.out.println("制表:"+temp2);
        // 换行
        char temp3 = '\n';
        System.out.println("换行:"+temp3);
        // 回车
        char temp4 = '\r';
        System.out.println("回车:"+temp4);
        // 双引号
        char temp5 = '\"';
        System.out.println("双引号:"+temp5);
        // 单引号
        char temp6 = '\'';
        System.out.println("单引号:"+temp6);
        // 反斜杠
        char temp7 = '\\';
        System.out.println("反斜杠:"+temp7);

        // char类型常用用法
        char temp8 = 'a';
        System.out.println("char类型："+temp8);
    }
}
