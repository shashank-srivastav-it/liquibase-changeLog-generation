package com.backend.liquibaseGenerateChangeLog.repository;

import com.backend.liquibaseGenerateChangeLog.entities.University;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversityRepository extends CrudRepository<University,Long> {
}
