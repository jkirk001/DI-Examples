package com.example.diexamples.controller;

import com.example.diexamples.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyGreetingService")
    @Autowired
    public GreetingService greetingService;
    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
