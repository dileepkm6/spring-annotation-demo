package com.stackroute.domain;


public class Movie
{
    private Actor actor;

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }
    public void actorInfo()
    {
        System.out.println("Name   : "+actor.getName());
        System.out.println("Gender : "+actor.getGender());
        System.out.println("Age    : "+actor.getAge());
    }
}
