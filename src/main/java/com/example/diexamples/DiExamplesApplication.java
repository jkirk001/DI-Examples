package com.example.diexamples;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.example.diexamples.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiExamplesApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(DiExamplesApplication.class, args);
        MyController myController= (MyController) ctx.getBean("myController");
        String greeting = myController.sayHello();
        System.out.println(greeting);
    }

}
