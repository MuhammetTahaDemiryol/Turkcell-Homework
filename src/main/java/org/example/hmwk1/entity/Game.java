package org.example.hmwk1.entity;


import lombok.Data;

@Data
public class Game{
    private int id;
    private String name;
    private double cost=0;
    private String description = "Lorem ipsum dolores ...";
    private int countOwner;


    public Game(int id, String name, double cost, String description, int countOwner ) {
        this.id = id;
        this.name = name;
        this.cost = cost;
        this.description = description;
        this.countOwner = countOwner;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", description='" + description + '\'' +
                ", countOwner=" + countOwner +
                '}';
    }
}
