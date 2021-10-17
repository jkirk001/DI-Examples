package com.example.diexamples.controller;

import com.example.diexamples.services.GreetingService;

public class PropertyInjectedController {
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
