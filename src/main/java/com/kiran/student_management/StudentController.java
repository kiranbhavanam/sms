package com.kiran.student_management;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/home")
    public  String hey(){
        return "hello bhai";
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public  String getLost(){
        return "get lost";
    }

}
