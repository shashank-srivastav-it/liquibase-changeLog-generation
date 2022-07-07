package com.backend.liquibaseGenerateChangeLog;

import com.backend.liquibaseGenerateChangeLog.entities.Employee;
import com.backend.liquibaseGenerateChangeLog.entities.Student;
import com.backend.liquibaseGenerateChangeLog.entities.University;
import com.backend.liquibaseGenerateChangeLog.repository.EmployeeRepository;
import com.backend.liquibaseGenerateChangeLog.repository.StudentRepository;
import com.backend.liquibaseGenerateChangeLog.repository.UniversityRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class LiquibaseGenerateChangeLogApplication {

    public static void main(String[] args) {
//        SpringApplication.run(LiquibaseGenerateChangeLogApplication.class, args);
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(LiquibaseGenerateChangeLogApplication.class, args);
        EmployeeRepository employeeRepository = configurableApplicationContext.getBean(EmployeeRepository.class);
        StudentRepository studentRepository = configurableApplicationContext.getBean(StudentRepository.class);
        UniversityRepository univeristyRepository = configurableApplicationContext.getBean(UniversityRepository.class);

        Student firstStudent = new Student("1111");
        Student secondStudent = new Student("2222");
        Student thirdStudent = new Student("3333");
        studentRepository.save(thirdStudent);
        List<Student> students = Arrays.asList(firstStudent,secondStudent);
        University university = new University("GLBITM",students);
        univeristyRepository.save(university);
        Employee employee = new Employee("shashank", "it17136shashank@gmail.com", 10000.0);
        employeeRepository.save(employee);
        univeristyRepository.delete(university);
    }

}
