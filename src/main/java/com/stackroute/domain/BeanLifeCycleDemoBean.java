package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoBean implements InitializingBean, DisposableBean {


    @Override
    public void destroy() throws Exception {
        System.out.println("bean is destroyed");

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("bean has been init");

    }

    public void customInit(){
        System.out.println("Custom init has been called");
    }
    public void customDestroy(){
        System.out.println("Custom Destroy has been called");
    }
}
