package com.baidu;

import java.lang.reflect.Constructor;

public class ReflectClassDemo {
    public static void main(String[] args) {
        try {
//            Student student = Student.class.newInstance();
            Student student = (Student) Class.forName("com.baidu.Student").newInstance();
            Class<? extends Student> aClass = student.getClass();
            System.out.println(student.getClass().getName() + " " + student.getName());

            System.out.println(Class.forName("com.baidu.Student"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(Integer.class);
    }
}

class Student {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
