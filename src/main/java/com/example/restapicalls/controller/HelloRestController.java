package com.example.restapicalls.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/web")

public class HelloRestController {
    @GetMapping("/message")
    public String message() {
        return "Hello From BridgeLabz";
    }
        @GetMapping("/query")
        public String sayHello(@RequestParam String name) {
            return "Hello "+name+" From BridgeLabz";
    }
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello "+name+" From BridgeLabz";
    }
}
