package com.kiran.student_management.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleStudent {

    @RequestMapping("/example")
    public  String go(){
        return "go";
    }
}
