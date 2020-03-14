package com.baidu;

import java.util.Arrays;

public class ComparableDemo {
    public static void main(String[] args) {
        Person[] p = new Person[2];
        p[0] = new Person(52.0);
        p[1] = new Person(52.6);
        Arrays.sort(p);
        System.out.println(Arrays.toString(p));
    }
}
