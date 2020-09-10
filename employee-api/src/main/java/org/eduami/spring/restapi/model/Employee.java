package org.eduami.spring.restapi.model;

public class Employee {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee() {
    }

    public Employee(int id, String name) {
        this.name = name;
        this.id = id;
    }
}
