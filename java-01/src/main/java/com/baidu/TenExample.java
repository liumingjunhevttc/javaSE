package com.baidu;

/**
 * 强制类型转换
 * @author 刘明君
 * 2020-02-14
 */
public class TenExample {
    public static void main(String[] args) {
        // 关系运算符
        int x= 3;
        System.out.println("等于(x==7):"+(x==7));
        System.out.println("不等于(x!=7):"+(x!=7));
        System.out.println("大于(x>7):"+(x>7));
        System.out.println("大于等于(x>=7):"+(x>=7));
        System.out.println("小于(x<7):"+(x<7));
        System.out.println("小于等于(x<=7):"+(x<=7));
        // 逻辑运算符
        String str = "liu";
//        String str = null; 出现这种情况，&& 不报错；|| 报错
        System.out.println("短路与:"+(str != null && str.equals("liu")));
        System.out.println("短路或:"+(str != null || str.equals("liu")));
        // 三元运算符
        boolean flag = true;
        System.out.println(flag?"我是真的":"我是假的");
    }
}
