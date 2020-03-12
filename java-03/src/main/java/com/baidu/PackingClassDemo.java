package com.baidu;

import org.omg.CORBA.IntHolder;

public class PackingClassDemo {
    public static void main(String[] args) {
//        Integer n = null;
//        System.out.println(2*n);


//        Integer n  = 1;
//        Double x = 2.0;
//        System.out.println(true?n:x);
        IntHolder c = new IntHolder(5);
        people(c);
        System.out.println(c.value);
    }


    public static void people(int x){
        x=x*3;
    }

    public static void people(Integer x){
        x=x*3;
    }

    public static void people(IntHolder x){
        x.value = 3*x.value;
    }

}
