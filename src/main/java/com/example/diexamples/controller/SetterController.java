package com.example.diexamples.controller;

import com.example.diexamples.services.GreetingService;

public class SetterController {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }

}
