package com.github.mddarr.kafka.producer.sportsfeed.models.scoreboard;

import java.util.List;

public class Scoreboard {

    List<List<GameScore>> gameScore;
    String lastUpdatedOn;
    public List<List<GameScore>> getGameScore(){
        return gameScore;
    }
    public String getLastUpdatedOn(){
        return lastUpdatedOn;
    }


}
