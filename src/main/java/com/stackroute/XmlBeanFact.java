package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class XmlBeanFact {
    public static void main(String[] args) {
        XmlBeanFactory context= new XmlBeanFactory(new ClassPathResource("beans.xml"));
        Movie movie=context.getBean("movie",Movie.class);
        movie.getActorInfo();
    }
}
