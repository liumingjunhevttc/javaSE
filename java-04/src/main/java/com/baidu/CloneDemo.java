package com.baidu;

public class CloneDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person1 person1 = new Person1();
        person1.setId(1);
        person1.setName("张三");
        Person1 person11 = (Person1)person1.clone();
        System.out.println(person11);
        person1.setName("李四");
        System.out.println(person11);
    }
}
class Person1{
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

    @Override
    public String toString() {
        return "Person1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person1 person1 = new Person1();
        person1.setId(this.id);
        person1.setName(this.name);
        return person1;
    }
}
