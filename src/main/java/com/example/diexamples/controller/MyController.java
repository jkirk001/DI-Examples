package com.example.diexamples.controller;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello(){
        System.out.println("hello there");
        return "HELLO";
    }
}
