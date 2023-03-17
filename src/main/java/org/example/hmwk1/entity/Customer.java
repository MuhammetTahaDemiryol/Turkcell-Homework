package org.example.hmwk1.entity;


import java.util.ArrayList;
import java.util.List;

public class Customer extends User {

    private String name;
    private String surName;
    private String tc;
    private int birthYear;
    private  List<Game> games = new ArrayList<>();


    public Customer(int id, String email, String password, String name, String surName, String tc, int birthYear ) {
        super(id, email, password);
        this.name = name;
        this.surName = surName;
        this.tc = tc;
        this.birthYear = birthYear;

    }

    public Customer(int id, String email, String password, String name, String surName, String tc, int birthYear, Game game ) {
        super(id, email, password);
        this.name = name;
        this.surName = surName;
        this.tc = tc;
        this.birthYear = birthYear;
        this.games.add(game);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public List<Game> getGames() {
        return games;
    }

    public void addGame(Game game) {
        this.games.add(game);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", tc='" + tc + '\'' +
                ", birthYear=" + birthYear +
                ", games=" + games +
                '}';
    }
}
