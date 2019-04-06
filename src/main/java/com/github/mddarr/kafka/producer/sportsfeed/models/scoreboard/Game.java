package com.github.mddarr.kafka.producer.sportsfeed.models.scoreboard;

public class Game {

    private  String isUnplayed;
    private String isInProgress;
    private String playStatus;
    private int awayScore;
    private int homeScore;
    private String location;

    private Team homeTeam;
    private Team awayTeam;

    public int gameID;

    public String getisUnplayed(){
        return isUnplayed;
    }


    public int getAwayScore(){return awayScore;}
    public int getHomeScore(){return homeScore;}
    public String getLocation(){return location;}
    public String getIsUnplayed(){return isUnplayed;}

    public void setIsUnplayed(String isUnplayed) {
        this.isUnplayed = isUnplayed;
    }

    public void setisUnplayed(String unplayed){
        this.isUnplayed = unplayed;
    }

    public String getPlayStatus() {
        return playStatus;
    }

    public void setPlayStatus(String playStatus) {
        this.playStatus = playStatus;
    }

    public void setAwayScore(int awayScore) {
        this.awayScore = awayScore;
    }

    public void setHomeScore(int homeScore) {
        this.homeScore = homeScore;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAwayTeam(Team awayTeam){
        this.awayTeam =awayTeam;
    }
    public void setHomeTeam(Team homeTeam){
        this.homeTeam = homeTeam;
    }

    public Game(int i){
        this.gameID =i;
    }



}
