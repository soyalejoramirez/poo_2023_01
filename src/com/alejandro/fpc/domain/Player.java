package com.alejandro.fpc.domain;

public class Player {
    private String name;
    private String position;
    private String dominantLeg;
    private int dorsal;

    public Player(String name, String position, String dominantLeg) {
        this.name = name;
        this.position = position;
        this.dominantLeg = dominantLeg;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getDominantLeg() {
        return dominantLeg;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
}
