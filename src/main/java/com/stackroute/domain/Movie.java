package com.stackroute.domain;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component("movie")
//default name of bean is firstLetter is small of class name
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware
{
    @Autowired
    private Actor actor;
    public void actorInfo()
    {
        System.out.println("Name   : "+actor.getName());
        System.out.println("Gender : "+actor.getGender());
        System.out.println("Age    : "+actor.getAge());
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException
    {
        System.out.println("Using beanfactoryaware...");
        Movie movie=beanFactory.getBean("movie",Movie.class);
        movie.actorInfo();
    }

    @Override
    public void setBeanName(String beanName)
    {
        System.out.println("beanName :"+beanName);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException
    {
        System.out.println("Using applicationcontextaware...");
        Movie m=applicationContext.getBean("movie",Movie.class);
        m.actorInfo();
    }
}
