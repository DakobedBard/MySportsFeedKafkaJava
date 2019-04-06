package com.github.mddarr.kafka.producer.sportsfeed.HttpClient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class HttpBasicAuth {


    public static void main(String[] args) {

        try {

            String baseURL = "https://api.mysportsfeeds.com/v1.2/pull/mlb/";
            //URL url = new URL ("https://api.mysportsfeeds.com/v1.2/pull/mlb/2018-regular/full_game_schedule.json?date=20180415");
            URL url = new URL(" https://api.mysportsfeeds.com/v1.2/pull/mlb/2018-regular/scoreboard.json?fordate=20180415");

            String apiKey = "a3e23236-4c6c-4c59-a21d-f3283a:1!Iksarmanssss";
            String encodedString = Base64.getEncoder().encodeToString(apiKey.getBytes());
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setDoOutput(true);
            connection.setRequestProperty("Authorization", "Basic " + encodedString);
            InputStream content = (InputStream) connection.getInputStream();
            BufferedReader in =
                    new BufferedReader(new InputStreamReader(content));
            String line;
            int count = 0;
            if ((line = in.readLine()) != null) {
                String jsonString = line;
                System.out.println(jsonString);
            }


            //while ((line = in.readLine()) != null) {
            //  count += 1;
            //System.out.println(count);

            //System.out.println(line);
            //  }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}