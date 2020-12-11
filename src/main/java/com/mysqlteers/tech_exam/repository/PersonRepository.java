package com.mysqlteers.tech_exam.repository;

import com.mysqlteers.tech_exam.Model.Person;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends CrudRepository<Person, Long> {
    Optional<Person> findByName(String name);
    List<Person> findAllByOrderByName();
}
