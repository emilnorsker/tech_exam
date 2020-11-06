package com.mysqlteers.tech_exam.repository;

import com.mysqlteers.tech_exam.Model.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, Long> {
}
