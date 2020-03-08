package com.baidu;

public class Employee {
    public Integer getSalary(int a){
        return a;
    }

    public Employee getBuddy(){
        return this;
    }
}
class Manager extends Employee{

    public Manager(){
        super();
    }
    // 添加方法和域
    @Override
    public Integer getSalary(int a) {
        return super.getSalary(a);
    }

    @Override
    public Manager getBuddy() {
        return this;
    }
}
final class Executive extends Manager{
    public final String getName(){
        return "hello";
    }
}

class Test{
    public static void main(String[] args) {
        Employee employee;
        employee=new Employee();
        employee=new Manager();
    }
}
