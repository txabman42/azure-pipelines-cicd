package com.txabman.azurepipelines.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello-world")
    public @ResponseBody
    String getHelloWorld() {
        return "Hello World!";
    }
}
