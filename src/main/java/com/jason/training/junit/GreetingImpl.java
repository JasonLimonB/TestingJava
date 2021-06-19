package com.jason.training.junit;

public class GreetingImpl implements IGreeting{

    @Override
    public String greetHello(String name) {

        if (name == null || name.isEmpty() )
            throw new IllegalArgumentException();

        return "Hello " + name;
    }

}
