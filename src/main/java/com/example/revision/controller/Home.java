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

    @GetMapping("/student1")
    StudentModel student1() {
        StudentModel student = new StudentModel(1,"Milan","mach.stephenson01@gmail.com");
        return student;
    }

    @GetMapping("/student2")
    StudentModel student2(){
        StudentModel student = new StudentModel(2,"Arjun","Arjun11@gmail.com");
        return student;
    }

    @GetMapping("student3")
    StudentModel student3(){
        StudentModel student = new StudentModel(3,"Champ","Champ@gmail.com");
        return student;
    }

    @GetMapping("student4")
    StudentModel student4(){
        StudentModel student = new StudentModel(4,"Drake","Drake@gmail.com");
        return student;
    }

    @GetMapping("student5")
    StudentModel student5(){
        StudentModel student = new StudentModel(5,"Terahertz","Terehertz@gmail.com");
        return student;
    }





}
