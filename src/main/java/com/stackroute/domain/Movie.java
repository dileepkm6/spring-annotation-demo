package com.stackroute.domain;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("movie")
//default name of bean is firstLetter is small of class name
public class Movie
{
    @Autowired
    private Actor actor;
    public void actorInfo()
    {
        System.out.println("Name   : "+actor.getName());
        System.out.println("Gender : "+actor.getGender());
        System.out.println("Age    : "+actor.getAge());
    }
}
