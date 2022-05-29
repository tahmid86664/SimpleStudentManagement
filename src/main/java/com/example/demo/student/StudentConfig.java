package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return  args -> {
            Student tahmid = new Student(39L,
                    "Tahmid",
                    "tahmid@gmail.com",
                    LocalDate.of(1997, AUGUST, 25),
                    25,
                    4,
                    2
            );
            Student tonni = new Student(5L,
                    "Tonni",
                    "tonni@gmail.com",
                    LocalDate.of(2000, JANUARY, 19),
                    21,
                    2,
                    2
            );

            repository.saveAll(
                    List.of(tahmid, tonni)
            );
        };
    }
}
