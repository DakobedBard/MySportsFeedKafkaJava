package com.github.mddarr.kafka.producer.sportsfeed.models.scoreboard;

import java.util.List;

public class Scoreboard {

    private List<Game> games;

    public Scoreboard(){

    }

    public void addGame(Game game){
        games.add(game);
    }

}
