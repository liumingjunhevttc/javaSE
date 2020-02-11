package com.baidu;

/**
 * 基本数据类型---浮点数据类型
 * @author 刘明君
 * 2020-02-11
 */
public class FlourSample {
    public static void main(String[] args) {
        //float类型(必须使用F或者f)
        float temp1 = 3.12336F;
        // double类型(可以使用d或者D)
        double temp2 = 3.12336D;
        // 正无穷大
        double temp3 = Double.POSITIVE_INFINITY;
        // 负无穷大
        double temp4 = Double.NEGATIVE_INFINITY;
        // NaN
        double temp5 = Double.NaN;
        // 判断某个数是否是NaN
        if(Double.isNaN(temp5)){
            System.out.println(temp5+"是NaN");
        }
    }
}
