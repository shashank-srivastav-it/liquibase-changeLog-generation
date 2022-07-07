package com.backend.liquibaseGenerateChangeLog.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Table(name = "employee_table")
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "employee_name")
    private String employeeName;

    @Column(name = "email")
    private String email;

    @Column(name = "salary")
    private Double salary;

    public Employee(String employeeName, String email, Double salary) {
        this.employeeName = employeeName;
        this.email = email;
        this.salary = salary;
    }
}
