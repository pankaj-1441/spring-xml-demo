package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EqualityCheck {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        Movie beanA=context.getBean("movie",Movie.class);
        Movie beanB=context.getBean("movie",Movie.class);

        System.out.println(beanA==beanB);




    }
}
