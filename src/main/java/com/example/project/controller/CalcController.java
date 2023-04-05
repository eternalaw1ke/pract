package com.example.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    @GetMapping("/plus/{a}/{b}")
    public Integer plus(@PathVariable Integer a, @PathVariable Integer b) {
        return a + b;
    }
    @GetMapping("/minus/{a}/{b}")
    public Integer minus(@PathVariable Integer a, @PathVariable Integer b) {
        return a - b;
    }
    @GetMapping("/mult/{a}/{b}")
    public Integer mult(@PathVariable Integer a, @PathVariable Integer b) {
        return a * b;
    }
}


