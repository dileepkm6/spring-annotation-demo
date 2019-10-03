package com.stackroute;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//        Movie movie=context.getBean("movie",Movie.class);
//        movie.actorInfo();
        context.close();
    }
}
