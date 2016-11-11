package com.ilyamur.basic.spring.configurable.entity;

import com.ilyamur.basic.spring.configurable.service.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

@Configurable
public class Person {

    @Autowired
    private Greeter greeter;

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getPersonalGreeting() {
        return greeter.getGreeting(name);
    }
}
