package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("actor")
public class Actor
{
    //setting properties with .properties file
    @Value("${Actor.name}")
    private String name;
    @Value("${Actor.gender}")
    private String gender;
    @Value("${Actor.age}")
    private int age;


    public String getName() {
        return name;
    }


    public String getGender() {
        return gender;
    }


    public int getAge() {
        return age;
    }

}
