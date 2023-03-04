package com.alejandro.bank.domain;

public class Person {
    public int id;
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this(name);
        this.id = id;
    }
}
