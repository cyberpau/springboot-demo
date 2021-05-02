package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student paulo = new Student(
                    "Paulo",
                    "paulotest@gmail.com",
                    LocalDate.of(1995, 02, 07)
            );
            Student jevielyn = new Student(
                    "Jevielyn",
                    "jevielyntest@gmail.com",
                    LocalDate.of(1994, 12, 07)
            );

            repository.saveAll(List.of(paulo, jevielyn));
        };

    }
}
