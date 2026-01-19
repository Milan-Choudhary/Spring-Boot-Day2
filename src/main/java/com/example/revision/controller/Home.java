package com.example.revision.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {

    @GetMapping("/About")
    public String about() {
        return "This is about page";
    }

}
