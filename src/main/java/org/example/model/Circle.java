package org.example.model;

public class Circle {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("Circle's setter called");
        throw(new RuntimeException("Exception !!!"));
    }

    public String setNameAndReturn(String name) {
        this.name = name;
        System.out.println("Circle's setter called");
        return name;
    }
}
