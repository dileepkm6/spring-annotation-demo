package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("actor")
public class Actor
{
    @Value("Aman")
    private String name;
    @Value("Male")
    private String gender;
    @Value("23")
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
