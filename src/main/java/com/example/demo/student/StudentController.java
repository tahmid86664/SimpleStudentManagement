package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {   // @autowired automatically instantiated studentService
        this.studentService = studentService;   // without @Autowired this will not work because studentService is declared but not instantiated
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

}
