package com.github.mddarr.kafka.producer.sportsfeed.HttpClient;
import java.lang.reflect.Type;
import java.util.List;


public class GSONPractice {

    public static void main(String[] args) {

        String ScoreBoardString = "{\"scoreboard\":{\"lastUpdatedOn\":\"2019-04-06 1:34:49 PM\",\"gameScore\":[{\"game\":{\"ID\":\"43648\",\"scheduleStatus\":\"Normal\",\"originalDate\":null,\"originalTime\":null,\"delayedOrPostponedReason\":null,\"date\":\"2018-04-15\",\"time\":\"1:05PM\",\"awayTeam\":{\"ID\":\"111\",\"City\":\"Baltimore\",\"Name\":\"Orioles\",\"Abbreviation\":\"BAL\"},\"homeTeam\":{\"ID\":\"113\",\"City\":\"Boston\",\"Name\":\"Red Sox\",\"Abbreviation\":\"BOS\"},\"location\":\"Fenway Park\"},\"isUnplayed\":\"false\",\"isInProgress\":\"false\",\"isCompleted\":\"true\",\"playStatus\":null,\"awayScore\":\"1\",\"homeScore\":\"3\",\"inningSummary\":{\"inning\":[{\"@number\":\"1\",\"awayScore\":\"1\",\"homeScore\":\"0\"},{\"@number\":\"2\",\"awayScore\":\"0\",\"homeScore\":\"0\"},{\"@number\":\"3\",\"awayScore\":\"0\",\"homeScore\":\"0\"},{\"@number\":\"4\",\"awayScore\":\"0\",\"homeScore\":\"0\"},{\"@number\":\"5\",\"awayScore\":\"0\",\"homeScore\":\"1\"},{\"@number\":\"6\",\"awayScore\":\"0\",\"homeScore\":\"2\"},{\"@number\":\"7\",\"awayScore\":\"0\",\"homeScore\":\"0\"},{\"@number\":\"8\",\"awayScore\":\"0\",\"homeScore\":\"0\"},{\"@number\":\"9\",\"awayScore\":\"0\",\"homeScore\":\"0\"}]}}\n" +
                "\n" +
                "{\"game\":{\"ID\":\"43649\",\"scheduleStatus\":\"Normal\",\"originalDate\":null,\"originalTime\":null,\"delayedOrPostponedReason\":null,\"date\":\"2018-04-15\",\"time\":\"1:10PM\",\"awayTeam\":{\"ID\":\"134\",\"City\":\"Milwaukee\",\"Name\":\"Brewers\",\"Abbreviation\":\"MIL\"},\"homeTeam\":{\"ID\":\"127\",\"City\":\"New York\",\"Name\":\"Mets\",\"Abbreviation\":\"NYM\"},\"location\":\"Citi Field\"},\"isUnplayed\":\"false\",\"isInProgress\":\"false\",\"isCompleted\":\"true\",\"playStatus\":null,\"awayScore\":\"2\",\"homeScore\":\"3\",\"inningSummary\":{\"inning\":[{\"@number\":\"1\",\"awayScore\":\"0\",\"homeScore\":\"1\"},{\"@number\":\"2\",\"awayScore\":\"0\",\"homeScore\":\"0\"},{\"@number\":\"3\",\"awayScore\":\"0\",\"homeScore\":\"0\"},{\"@number\":\"4\",\"awayScore\":\"0\",\"homeScore\":\"0\"},{\"@number\":\"5\",\"awayScore\":\"0\",\"homeScore\":\"0\"},{\"@number\":\"6\",\"awayScore\":\"2\",\"homeScore\":\"1\"},{\"@number\":\"7\",\"awayScore\":\"0\",\"homeScore\":\"0\"},{\"@number\":\"8\",\"awayScore\":\"0\",\"homeScore\":\"0\"},{\"@number\":\"9\",\"awayScore\":\"0\",\"homeScore\":\"1\"}]}}\n"+"}";



    }

}
