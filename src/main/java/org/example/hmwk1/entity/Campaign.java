package org.example.hmwk1.entity;

import java.util.ArrayList;
import java.util.List;

public class Campaign {
    private int id;
    private int discountAmount=0;
    private int dayTime = 15;
    private List<Game> games = new ArrayList<>();
    public Campaign(int id, int discountAmount, int dayTime, Game games) {
        this.id=id;
        this.discountAmount = discountAmount;
        this.dayTime = dayTime;
        this.games.add(games) ;
    }

    public int getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(int discountAmount) {
        this.discountAmount = discountAmount;
    }

    public int getDayTime() {
        return dayTime;
    }

    public void setDayTime(int dayTime) {
        this.dayTime = dayTime;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGame(Game games) {
        this.games.add(games) ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Campaign{" +
                "id=" + id +
                ", discountAmount=" + discountAmount +
                ", dayTime=" + dayTime +
                ", game=" + games +
                '}';
    }
}
