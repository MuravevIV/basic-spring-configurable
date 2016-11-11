package com.ilyamur.basic.spring.configurable.service;

import org.springframework.stereotype.Service;

@Service
public class Greeter {

    public String getGreeting(String name) {
        return String.format("Hello, my name is %s!", name);
    }
}
