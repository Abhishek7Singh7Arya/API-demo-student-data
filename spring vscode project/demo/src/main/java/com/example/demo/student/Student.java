package com.example.demo.student;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.*;

@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
        name = "student_sequence",
        sequenceName = "student_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "student_sequence"
    )
    private Long id;
    private LocalDate dob;
    private String email;
    private String name ;

    @Transient
    private Integer age;
    public Student(Long id, LocalDate dob, String email, String name ) {
        this.id = id;
        this.dob = dob;
        this.email = email;
        this.name = name;

    }
    public Student() {
    }
    public Student(LocalDate dob, String email, String name) {
        this.dob = dob;
        this.email = email;
        this.name = name;

    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getAge() {
        return Period.between(dob,LocalDate.now()).getYears();
    }
    public void setAge(Integer age) {
        this.age = age;
    }
}
