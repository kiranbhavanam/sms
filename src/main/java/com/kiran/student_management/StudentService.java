//package com.kiran.student_management;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.List;
//
//@Service
//public class StudentService {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    public List<Student> getAllStudents() {
//        return studentRepository.findAll();
//    }
//
//    public Student getStudentById(String id) {
//        return studentRepository.findById(id).orElse(null);
//    }
//
//    public void addStudent(Student student) {
//        studentRepository.save(student);
//    }
//
//    public void updateStudent(String id, Student updatedStudent) {
//        if (studentRepository.existsById(id)) {
//            updatedStudent.setId(id);
//            studentRepository.save(updatedStudent);
//        }
//    }
//
//    public void deleteStudent(String id) {
//        studentRepository.deleteById(id);
//    }
//}