package com.example.apidemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.apidemo.controller"})
public class ApidemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApidemoApplication.class, args);
    }

}
