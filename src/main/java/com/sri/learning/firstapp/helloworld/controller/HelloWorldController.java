package com.sri.learning.firstapp.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/sayHi")
    public String sayHello(){
        return "Hello World!";
    }

    @PostMapping("/sayHello")
    public String sayHelloWorld() {
        return "Hello!";
    }
}
