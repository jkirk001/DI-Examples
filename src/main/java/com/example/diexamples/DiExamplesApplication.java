package com.example.diexamples;

import com.example.diexamples.controller.ConstructorController;
import com.example.diexamples.controller.MyController;
import com.example.diexamples.controller.PropertyInjectedController;
import com.example.diexamples.controller.SetterController;
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

        System.out.println("----------------Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        System.out.println(propertyInjectedController.getGreeting());

        System.out.println("----------------Setter");
        SetterController setterController = (SetterController) ctx.getBean("setterController");
        //Set is done on initialization thanks to AutoWired
        System.out.println(setterController.getGreeting());

        System.out.println("----------------Constructor - Preferred");
        ConstructorController constructorController= (ConstructorController) ctx.getBean("constructorController");
        System.out.println(constructorController.getGreeting());

    }

}
