package com.alejandro.fpc.domain;

import java.util.List;

public class Tournament {
    private String name;
    private String type;
    private int semester;
    private List<Team> teams;

    public void printTeamPlayers() {
        for (Team t : teams) {
            for (Player p: t.getPlayers()) {
                System.out.println(p.getName());
            }
        }
    }

    public List<Team> getTeams() {
        return teams;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getSemester() {
        return semester;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}
