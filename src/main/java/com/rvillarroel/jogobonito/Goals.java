package com.rvillarroel.jogobonito;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;


public class Goals {

    private final String id;
    Player player;
    Game match;

    public Goals(Player player, Game match) {
        this.player = player;
        this.match = match;
        id = UUID.randomUUID().toString();
    }



    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Game getMatch() {
        return match;
    }

    public void setMatch(Game match) {
        this.match = match;
    }


}
