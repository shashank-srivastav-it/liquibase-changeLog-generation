package com.backend.liquibaseGenerateChangeLog.repository;

import com.backend.liquibaseGenerateChangeLog.entities.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {
}
