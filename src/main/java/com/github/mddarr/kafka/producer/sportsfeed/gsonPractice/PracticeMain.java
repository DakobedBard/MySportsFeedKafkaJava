package com.github.mddarr.kafka.producer.sportsfeed.gsonPractice;


import com.google.gson.Gson;

import java.util.List;
public class PracticeMain {


        public static void main(String[] args) {
            String str = "    {" +
                    "       \"Answers\": [[{" +
                    "           \"Locale\": \"Ru\"," +
                    "           \"Name\": \"Name1\"" +
                    "       }," +
                    "       {" +
                    "           \"Locale\": \"En\"," +
                    "           \"Name\": \"Name2\"" +
                    "       }]," +
                    "       [{" +
                    "           \"Locale\": \"Ru\"," +
                    "           \"Name\": \"Name3\"" +
                    "       }," +
                    "       {" +
                    "           \"Locale\": \"En\"," +
                    "           \"Name\": \"Name4\"" +
                    "       }]]" +
                    "    }";
            System.out.println(str);
            Gson gson = new Gson();

            MyObject obj  = gson.fromJson(str, MyObject.class);

            List<List<Answer>> answers = obj.getAnswers();

            for(List<Answer> parts : answers){
                for(Answer part : parts){
                    System.out.println("locale: " + part.getLocale() + "; name: " + part.getName());
                }
            }

        }


}
