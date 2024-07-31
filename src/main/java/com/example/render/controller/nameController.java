package com.example.render.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nameController {

    @GetMapping("/name")
    public String getName() {
        return "Katherin Andrea Roca Patzan";
    }
}