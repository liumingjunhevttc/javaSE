package com.baidu;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

public class ClassDemo006 {
    public static void main(String[] args) throws Exception{
        Class<Cat> catClass = Cat.class;
        Constructor<Cat> constructor = catClass.getConstructor(Integer.class, String.class);
        Cat cat = constructor.newInstance(1, "小王");
        System.out.println(cat);
        Field id = catClass.getDeclaredField("id");
        id.setAccessible(true);
        System.out.println(id.isAccessible());
        Object o = id.get(cat);
        id.set(cat,52);
        System.out.println(o);
        Field[] fields = catClass.getFields();
        System.out.println(Arrays.toString(fields));
//        Field id1 = catClass.getField("id");
//        System.out.println(id1);
        Field[] declaredFields = catClass.getDeclaredFields();
        System.out.println(Arrays.toString(declaredFields));
    }
}

class Cat{
    private Integer id;
    private String name;

    public Cat(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Cat() {
    }

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

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
