package com.alejandro.bank.domain;

public class Person {
    private int id;
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this(name);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }
}
