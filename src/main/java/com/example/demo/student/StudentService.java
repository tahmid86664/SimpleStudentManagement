package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service    // need for @Autowired
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
}


/*
List.of(
                new Student(39L,
                        "Tahmid",
                        "tahmid@gmail.com",
                        LocalDate.of(1997, Month.AUGUST, 25),
                        25,
                        4,
                        2),
                new Student(5L,
                        "Tonni",
                        "tonni@gmail.com",
                        LocalDate.of(2000, Month.JANUARY, 19),
                        21,
                        2,
                        2)
        );
* */