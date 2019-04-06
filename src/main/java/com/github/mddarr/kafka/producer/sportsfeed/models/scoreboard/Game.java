package com.github.mddarr.kafka.producer.sportsfeed.models.scoreboard;

public class Game {

    private  String isUnplayed;
    private String isInProgress;
    private String isCompleted;
    private String playStatus;
    private int awayScore;
    private int homeScore;

    public String getisUnplayed(){
        return isUnplayed;
    }
    public String getIsCompleted(){
        return isCompleted;
    }


    public String getIsInProgress(){
        return isInProgress;
    }

}
