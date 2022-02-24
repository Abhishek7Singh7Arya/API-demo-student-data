package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.NOVEMBER;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository)
    {
        return args->{
         Student abhishek =   new Student(
                 LocalDate.of(1999, NOVEMBER, 5),
                    "abhishekarya77@gmail.com",
                    "abhishek"
            );
         Student anuj = new Student(

                 LocalDate.of(1998, Month.NOVEMBER, 5),
                 "anuj77@gmail.com",
                 "anuj"
         );
         Student anukool = new Student(

                 LocalDate.of(1989, Month.NOVEMBER, 5),
                 "anukool77@gmail.com",
                 "anukool"
         );
       repository.saveAll(List.of(abhishek,anuj,anukool));

        };
    }
}
