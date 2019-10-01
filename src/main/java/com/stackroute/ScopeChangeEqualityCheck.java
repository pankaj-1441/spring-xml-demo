package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeChangeEqualityCheck {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans2.xml");
        Movie beanA=context.getBean("movieA",Movie.class);
        Movie beanB=context.getBean("movieB",Movie.class);

        System.out.println(beanA==beanB);

    }
}