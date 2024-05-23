package com.actuator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ActuatorController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the home page!";
    }

    @GetMapping("/about")
    public String about() {
        return "About Us";
    }

    @GetMapping("/contact")
    public String contact() {
        return "Contact Us";
    }
}

