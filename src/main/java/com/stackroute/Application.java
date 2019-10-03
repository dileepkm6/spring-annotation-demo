package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Movie movieA=context.getBean("movieBean",Movie.class);
        Movie movieB=context.getBean("movieBean",Movie.class);
        //movie.actorInfo();
        System.out.println(movieA==movieB);
        context.close();
    }
}
