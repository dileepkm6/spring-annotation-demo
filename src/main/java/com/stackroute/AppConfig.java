package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig
{
    @Bean
    public Actor actorBean()
    {
        Actor actor=new Actor();
        actor.setName("Aman Bhadani");
        actor.setGender("male");
        actor.setAge(23);
        return actor;
    }
    @Bean
    public Movie movieBean()
    {
        Movie movie=new Movie();
        movie.setActor(actorBean());
        return movie;
    }
}
