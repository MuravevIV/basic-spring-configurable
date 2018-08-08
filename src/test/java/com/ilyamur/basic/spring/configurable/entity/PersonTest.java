package com.ilyamur.basic.spring.configurable.entity;

import com.ilyamur.basic.spring.configurable.ApplicationConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ApplicationConfiguration.class})
public class PersonTest {

    @Test
    public void greetingsTest() {

        Person person = new Person("Steve");

        assertEquals("Hello, my name is Steve!", person.getPersonalGreeting());
    }
}
