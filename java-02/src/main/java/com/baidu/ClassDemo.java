package com.baidu;

public class ClassDemo {
    // 属性
    private Integer age;
    private String name;
    private long id;
    // 构造器
    public ClassDemo(Integer age, String name, long id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }
    public ClassDemo(){}
    // 方法
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public static void main(String[] args) {
        ClassDemo classDemo = new ClassDemo(24,"张三",2);

        ClassDemo classDemo1 = new ClassDemo();
        classDemo1.setAge(24);
        classDemo1.setName("张三");
        classDemo1.setId(2);
    }
}
