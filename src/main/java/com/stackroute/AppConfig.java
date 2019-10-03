package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig
{
    @Bean
    public Actor actorBean()
    {
        return new Actor("Aman","Male",23);

    }
    @Bean({"movieA","movieB"})
    @Scope(value = "prototype")
    public Movie movieBean()
    {

        return new Movie(actorBean());
    }
}
