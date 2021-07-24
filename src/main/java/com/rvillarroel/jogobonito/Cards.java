package com.rvillarroel.jogobonito;

public class Cards {

    Player players;
    Game match;

    public Cards(Player players, Game match) {
        this.players = players;
        this.match = match;
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
