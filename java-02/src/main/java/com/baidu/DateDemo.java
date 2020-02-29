package com.baidu;

import java.time.LocalDate;

public class DateDemo {
    public static void main(String[] args) {
        LocalDate.now();
        LocalDate localDate = LocalDate.of(2020, 02, 29);
        System.out.println(localDate.getYear());//2020
        System.out.println(localDate.getMonthValue());//02
        System.out.println(localDate.getDayOfMonth());//29
        System.out.println(localDate.getDayOfWeek());//saturday
        System.out.println(localDate.plusDays(5));//2020-03-05
        System.out.println(localDate.minusDays(5));//2020-02-24
    }
}
