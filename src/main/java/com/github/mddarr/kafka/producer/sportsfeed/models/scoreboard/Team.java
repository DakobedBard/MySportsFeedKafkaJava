package com.github.mddarr.kafka.producer.sportsfeed.models.scoreboard;

public class Team {

    private String city;
    private String name;
    private String abbreviation;

    public Team(String city_name, String team_name, String abbrev){
        this.city = city_name;
        this.name = team_name;
        this.abbreviation = abbrev;
    }
}
