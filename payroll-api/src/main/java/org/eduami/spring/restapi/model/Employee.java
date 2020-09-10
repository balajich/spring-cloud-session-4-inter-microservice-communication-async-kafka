package org.eduami.spring.restapi.model;

public class Employee {
    private int id;
    private int salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int id, int salary) {
        this.id = id;
        this.salary = salary;
    }

    public Employee() {
    }
}
