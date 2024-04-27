//package com.kiran.student_management;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/students")
//public class StudentController {
//
//    @Autowired
//    private StudentService studentService;
//
//    @GetMapping
//    public List<Student> getAllStudents() {
//        return studentService.getAllStudents();
//    }
//
//    @GetMapping("/{id}")
//    public Student getStudentById(@PathVariable String id) {
//        return studentService.getStudentById(id);
//    }
//
//    @PostMapping
//    public void addStudent(@RequestBody Student student) {
//        studentService.addStudent(student);
//    }
//
//    @PutMapping("/{id}")
//    public void updateStudent(@PathVariable String id, @RequestBody Student updatedStudent) {
//        studentService.updateStudent(id, updatedStudent);
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteStudent(@PathVariable String id) {
//        studentService.deleteStudent(id);
//    }
//}