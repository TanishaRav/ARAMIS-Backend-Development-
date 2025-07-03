package com.example.aramis.backend.development.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
Author: Tanisha Ravindran
Alstom intern
Created for educational purposes
 */

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Hello from Aramis Backend!";
    }
}


