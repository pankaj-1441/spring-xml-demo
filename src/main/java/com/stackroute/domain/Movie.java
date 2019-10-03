package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private Actor actor;
    private ApplicationContext context = null;
    private BeanFactory beanFactory = null;
    private String beanName = null;


    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void getActorInfo() {
        actor.actorInfo();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
        System.out.println("ApplicationContext has been set to your object");
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("BeanFactory object has been injected");

    }

    @Override
    public void setBeanName(String s) {
        this.beanName = s;
        System.out.println("bean name of your object is "+this.beanName);

    }

    public void displayDetails() {

    }

}