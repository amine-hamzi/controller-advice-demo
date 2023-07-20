package com.example.controller.advice.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/data")
    public Object getData() {
        return new Object();
    }
}
