package com.baidu;

public class Person implements Comparable,Cloneable {
    private Double salary;

    public Person(Double salary) {
        this.salary = salary;
    }

    public Person() {
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Person){
            Person person = (Person) o;
            return this.salary.compareTo(person.salary);
        } else {
            return -1;
        }
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "salary=" + salary +
                '}';
    }
}
