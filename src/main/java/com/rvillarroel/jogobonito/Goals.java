package com.rvillarroel.jogobonito;


public class Goals {
    Player player;
    Game match;

    public Goals(Player player, Game match) {
        this.player = player;
        this.match = match;
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
