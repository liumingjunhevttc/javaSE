package com.baidu;

public class CoercionDemo {
    public static void main(String[] args) {
        double x = 3.405;
        int nx = (int)x;
        System.out.println(nx);

        Employee employee = new Employee();
        Manager manager = (Manager)employee;
    }
}
