package com.jason.training.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GreetingImplTest{

    IGreeting greeting;

    @BeforeEach
    public void setup(){
        System.out.println("Setup");
        greeting = new GreetingImpl();
    }

    @Test
    public void testGreetHelloUsingValidOutput(){
        System.out.println("firsTest");
        Assertions.assertNotNull(greeting.greetHello("JUnit"));
        Assertions.assertEquals("Hello JUnit", greeting.greetHello("JUnit"));
    }

    @Test
    public void testGreetHelloShouldThrowException_WhenParameterIsNull(){
        System.out.println("Second Test");
        Assertions.assertThrows(IllegalArgumentException.class, ()->greeting.greetHello(null));
    }

    @Test
    public void testGreetHelloShouldThrowException_WhenParameterIsBlank(){
        System.out.println("Third test");
        Assertions.assertThrows(IllegalArgumentException.class, ()-> greeting.greetHello("") );
    }


    @AfterEach
    public void tearDown(){
        System.out.println("Tear down");
        greeting = null;
    }
}