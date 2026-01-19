package com.example.revision.controller;

import com.example.revision.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Home {

    @GetMapping("/About")
    public String about() {
        return "This is about page";
    }

    @GetMapping("/")
    StudentModel student() {
        StudentModel student = new StudentModel(1,"Milan","mach.stephenson01@gmail.com");
        return student;
    }

}
