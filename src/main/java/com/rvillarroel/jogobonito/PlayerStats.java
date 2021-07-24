package com.rvillarroel.jogobonito;

import java.time.LocalDate;

public class PlayerStats   {
    
    int gol;
    int redCard;
    int yellowCard;
    LocalDate registeredDate;
    Game match; 

    public int getGol() {
        return gol;
    }
    public void setGol(int gol) {
        this.gol = gol;
    }
    public int getRedCard() {
        return redCard;
    }
    public void setRedCard(int redCard) {
        this.redCard = redCard;
    }
    public int getYellowCard() {
        return yellowCard;
    }
    public void setYellowCard(int yellowCard) {
        this.yellowCard = yellowCard;
    }
    public LocalDate getRegisteredDate() {
        return registeredDate;
    }
    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }
    public Game getMatch() {
        return match;
    }
    public void setMatch(Game match) {
        this.match = match;
    }



}
