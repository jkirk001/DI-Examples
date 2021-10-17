package com.example.diexamples.controller;

import com.example.diexamples.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterControllerTest {

    SetterController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterController();
        controller.setGreetingService(new ConstructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}