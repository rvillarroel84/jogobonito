package com.rvillarroel.jogobonito;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;


public class Cards {

    private final String id;
    Player players;
    Game match;

    public Cards(Player players, Game match) {
        this.players = players;
        this.match = match;
        id = UUID.randomUUID().toString();
    }



    public Player getPlayers() {
        return players;
    }

    public void setPlayers(Player players) {
        this.players = players;
    }

    public Game getMatch() {
        return match;
    }

    public void setMatch(Game match) {
        this.match = match;
    }


    
}
