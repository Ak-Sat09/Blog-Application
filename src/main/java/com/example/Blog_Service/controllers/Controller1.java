package com.example.Blog_Service.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // ✅ marks this as a REST controller
public class Controller1 {

    // Simple GET endpoint to test
    @GetMapping("/blogs/test")
    public String testApi() {
        return "API is working!";
    }

    // Another example GET endpoint
    @GetMapping("/blogs/hello")
    public String helloApi() {
        return "Hello from Controller1!";
    }
}
