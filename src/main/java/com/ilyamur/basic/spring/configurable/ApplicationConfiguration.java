package com.ilyamur.basic.spring.configurable;

import com.ilyamur.basic.spring.configurable.entity.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

@Configuration
@ComponentScan
@EnableSpringConfigured
public class ApplicationConfiguration {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        Person person = new Person("Steve");
        System.out.println(person.getPersonalGreeting());
    }
}
