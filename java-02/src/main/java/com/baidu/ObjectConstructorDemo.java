package com.baidu;

public class ObjectConstructorDemo {

    public static void main(String[] args) {

        Car car = new Car();
    }
}

class Car{
     Integer id;
     String name;
     String type;
     private static String str;
     static {
         System.out.println("我是静态代码块");
     }
    public Car(Integer id, String name, String type) {
        this();
        this.id = id;
        this.name = name;
        this.type = type;
    }
    {
        id=1;
        name="张三";
        type="宝马";
        System.out.println(this);
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
