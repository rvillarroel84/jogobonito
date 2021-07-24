package com.rvillarroel.jogobonito;

 
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Team {
    
    String name;
    List<Player> players = new ArrayList<>();
    LocalDateTime createdDay;

    public Team(String name, LocalDateTime createdDay) {
        this.name = name; 
        this.createdDay = createdDay;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Player> getPlayers() {
        return players;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    public LocalDateTime getCreatedDay() {
        return createdDay;
    }
    public void setCreatedDay(LocalDateTime createdDay) {
        this.createdDay = createdDay;
    }
    
    @Override
    public String toString() {
        return "Team [createdDay=" + createdDay + ", name=" + name + ", players=" + players + "]";
    }
    

    
}
