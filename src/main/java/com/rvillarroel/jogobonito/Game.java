package com.rvillarroel.jogobonito;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Game {
    
    String name;
    LocalDate scheduleMatch;     
    Cards cards;
    Goals goals; 

    List<Team> teams = new ArrayList<>(2); 
    List<Player> players = new ArrayList<>(); 

    public Game(String name, LocalDate scheduleMatch) {
        this.name = name;
        this.scheduleMatch = scheduleMatch;
    }

    



    public LocalDate getScheduleMatch() {
        return scheduleMatch;
    }

    public void setScheduleMatch(LocalDate scheduleMatch) {
        this.scheduleMatch = scheduleMatch;
    }

    public Cards getCards() {
        return cards;
    }

    public void setCards(Cards cards) {
        this.cards = cards;
    }

    public Goals getGoals() {
        return goals;
    }

    public void setGoals(Goals goals) {
        this.goals = goals;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Game{name=").append(name);
        sb.append(", scheduleMatch=").append(scheduleMatch);
        sb.append(", teams=").append(teams);
        sb.append(", players=").append(players);
        sb.append('}');
        return sb.toString();
    }



}
