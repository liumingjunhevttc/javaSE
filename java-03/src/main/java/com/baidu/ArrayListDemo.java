package com.baidu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class ArrayListDemo extends Object{
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(15);
        System.out.println(arrayList);
        arrayList.ensureCapacity(10);
        arrayList.trimToSize();
        System.out.println(arrayList.size());
        ArrayList<Double> doubleArrayList = new ArrayList<>(10);

        arrayList.set(1,52);
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        System.out.println(arrayList.remove(1));
        for(Integer a1:arrayList){
            System.out.println(a1);
        }
    }
}
