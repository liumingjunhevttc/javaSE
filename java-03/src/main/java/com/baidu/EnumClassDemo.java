package com.baidu;

public class EnumClassDemo {
    public static void main(String[] args) {
        System.out.println(Size1.SMALL.toString());
        Size1 ssmall = Enum.valueOf(Size1.class, "SMALL");
        System.out.println(ssmall);
        System.out.println(Size1.values());
        System.out.println(Size1.EXTRA_LARCE.ordinal());
        System.out.println(Size1.EXTRA_LARCE.compareTo(Size1.MEDIAM));
    }
}
enum Size{
    SMALL,
    MEDIAM,
    LRCE,
    EXTRA_LARCE
}

enum Size1{
    SMALL("S"),
    MEDIAM("M"),
    LRCE("L"),
    EXTRA_LARCE("XL");
    private String abbreviation;
    private Size1(String abbreviation){
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
