package com.aniruddha.grammarai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GrammarAiApplication {

    public static void main(String[] args) {

        SpringApplication.run(GrammarAiApplication.class, args);
    }
}

//Why @SpringBootApplication?
//This annotation combines three annotations:
//@SpringBootConfiguration
//@EnableAutoConfiguration
//@ComponentScan
//Instead of writing all three, Spring Boot provides one convenience annotation.


//Why SpringApplication.run()?
//
//This single line does a lot of work:
//
//Creates Spring IoC Container
//Starts embedded Tomcat
//Reads application.properties or application.yml
//Creates all Spring Beans
//Scans Components
//Starts the application
//One line, hundreds of things happening internally.