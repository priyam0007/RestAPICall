package com.example.restapicalls.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/web")

public class HelloRestController {
    @GetMapping("/message")
    public String message() {
        return "Hello From BridgeLabz";
    }
}
