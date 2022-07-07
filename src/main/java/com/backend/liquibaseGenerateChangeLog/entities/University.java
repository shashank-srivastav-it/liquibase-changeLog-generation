package com.backend.liquibaseGenerateChangeLog.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "University")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    @JoinColumn(name = "university_id")
    private List<Student> students = new ArrayList<>();

    public University() {
    }

    public University(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
