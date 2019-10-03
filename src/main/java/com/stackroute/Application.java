package com.stackroute;

import com.stackroute.demo.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
//        Movie movie=context.getBean("movie", Movie.class);
//        movie.actorInfo();
        BeanLifecycleDemoBean beanLifecycle=context.getBean("beanLifeCycle",BeanLifecycleDemoBean.class);
        context.close();
    }
}
