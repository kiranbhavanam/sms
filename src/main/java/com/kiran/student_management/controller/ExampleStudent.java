package com.kiran.student_management.controller;

import com.kiran.student_management.Student;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExampleStudent {

    @RequestMapping("/example")
    public  String go(){
        return "go";
    }
    @PostMapping("/studentdata")
    public Student getStudent(@RequestBody Student student){
        System.out.println("Student data: "+student);
        return  student;
    }
}
