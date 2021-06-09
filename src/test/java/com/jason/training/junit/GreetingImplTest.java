package com.jason.training.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest{

    IGreeting greeting;

    @Before
    public void setup(){
        System.out.println("Setup");
        greeting = new GreetingImpl();
    }

    @Test
    public void testGreetHelloUsingValidOutput(){
        System.out.println("firsTest");
        assertNotNull(greeting.greetHello("JUnit"));
        assertEquals("Hello JUnit", greeting.greetHello("JUnit"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGreetHelloShouldThrowException_WhenParameterIsNull(){
        System.out.println("Second Test");
        greeting.greetHello(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGreetHelloShouldThrowException_WhenParameterIsBlank(){
        System.out.println("Third test");
        greeting.greetHello("");
    }


    @After
    public void tearDown(){
        System.out.println("Tear down");
        greeting = null;
    }
}