package com.stackroute.demo;

import com.stackroute.domain.Actor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("beanLifeCycle")
public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean
{
    @Autowired
    private Actor actor;

    public BeanLifecycleDemoBean() {
        System.out.println("BeanLifecycleDemoBean constructor is called");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Distroy bean method is called");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initializing bean method is called");
    }
    @PostConstruct
    public void customInit()
    {
        System.out.println("custom init method is called");
    }
    @PreDestroy
    public void customDestroy()
    {
        System.out.println("custom destroy method is called");
    }
    public void actorInfo()
    {
        System.out.println("Name   : "+actor.getName());
        System.out.println("Gender : "+actor.getGender());
        System.out.println("Age    : "+actor.getAge());
    }
}
