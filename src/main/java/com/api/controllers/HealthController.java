package com.api.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/")
    public String home() {
        return "API is running!";
    }

    @GetMapping("/ishealthOk")
    public String health() {
        return "OK";
    }
}
