package com.baidu;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectClassDemo2 {
    public static void main(String[] args) {
        // 获取公有域
        for (Field field:Student.class.getFields()){
            System.out.println(field.getName());
        }
        System.out.println("………………………………………………");
        //获取公有域（包括私有）
        for(Field field:Student.class.getDeclaredFields()){
            System.out.println(field.getName());
        }
        System.out.println("…………………………………………………………");
        // 获取公有方法(包含超类)
        for(Method method:Student.class.getMethods()){
            System.out.println(method.getName());
        }
        System.out.println("…………………………………………………………");
        // 获取本类公有方法
        for(Method method:Student.class.getDeclaredMethods()){
            System.out.println(method.getName());
        }
        System.out.println("…………………………………………………………");
        // 获取本类公有构造方法
        for(Constructor constructor:Student.class.getConstructors()){
            System.out.println(constructor.getName()+"  "+ Arrays.toString(constructor.getParameters()));
        }
        System.out.println("…………………………………………………………");
        // 获取本类公有构造方法
        for(Constructor constructor:Student.class.getDeclaredConstructors()){
            System.out.println(constructor.getName()+"  "+ Arrays.toString(constructor.getParameters()));
            System.out.println(constructor.getDeclaringClass());
            System.out.println(constructor.getExceptionTypes());
            System.out.println(constructor.getModifiers());
        }
    }
}