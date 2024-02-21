package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student mirriam = new Student(
                    "Mirriam",
                    "mirriam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5),
                    21
            );

            Student alex = new Student(
                    "Alex",
                    "alex.smith@gmail.com",
                    LocalDate.of(2001, Month.JANUARY, 4),
                    21
            );

                    repository.saveAll(List.of(mirriam,alex ));

        };



    }
}
