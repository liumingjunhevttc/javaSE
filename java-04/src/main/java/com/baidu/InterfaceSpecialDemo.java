package com.baidu;

public class InterfaceSpecialDemo {
    public static void main(String[] args) {
        Comparable p;
        Comparable p1 = new Comparable() {
            double SPEED_LIMIT = 95;
            @Override
            public int compareTo(Object o) {
                return 0;
            }
        };
        System.out.println(p1 instanceof Comparable);
    }
}
