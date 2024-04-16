package com.kiran.student_management;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/home")
    public  String hey(){
        return "hello bhai";
    }

}
