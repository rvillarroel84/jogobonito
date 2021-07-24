package com.rvillarroel.jogobonito;

import java.time.LocalDate; 
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Player {
 
    @Id
    private final String id;
    String name;
    String lastName;
    LocalDate birthDay;
    Team team;
    Cards cards;
    Goals goals;


    public Player(String id) {
        this.id = id;
      
    }      

    public Player(String name, String lastName, LocalDate birthDay, Team team) {
        this(UUID.randomUUID().toString());
        this.name = name;
        this.lastName = lastName;
        this.birthDay = birthDay;
        this.team = team;
    }     


    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    } 
    
    public int getAge(){

        int realAge =  LocalDate.now().getYear() - this.birthDay.getYear();

        int actualMonth  = LocalDate.now().getMonthValue();
        int actualDay  = LocalDate.now().getDayOfMonth();

        if ((this.birthDay.getMonthValue()  >= actualMonth) 
          & ( this.birthDay.getDayOfMonth() > actualDay)) {
                 realAge -= 1;
        }

        return realAge;
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

    @Override
    public String toString() {
        return "Player [birthDay=" + birthDay + ", lastName=" + lastName + ", name=" + name + "]";
    }

    public String getId() {
        return id;
    }

}
