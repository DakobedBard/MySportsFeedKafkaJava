package com.github.mddarr.kafka.producer.sportsfeed.gsonPractice;
/*
Practice deserilizing JSON into Java objects..

The attribute names of the Java objects must match those of JSON fields...

I need to have getters for that attributes in the Java object..

 */


import org.omg.CORBA.AnySeqHelper;

import java.util.List;

public class MyObject {

    List<List<Answer>> Answers;

    public List<List<Answer>> getAnswers(){
        return Answers;
    }

}
