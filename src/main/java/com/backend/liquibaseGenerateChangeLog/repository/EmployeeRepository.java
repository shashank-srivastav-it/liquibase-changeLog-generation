package com.backend.liquibaseGenerateChangeLog.repository;

import com.backend.liquibaseGenerateChangeLog.entities.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer> {
}
