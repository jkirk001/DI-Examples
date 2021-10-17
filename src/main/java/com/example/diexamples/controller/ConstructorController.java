package com.example.diexamples.controller;

import com.example.diexamples.services.GreetingService;

public class ConstructorController {
    private final GreetingService greetingService;

    public ConstructorController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
