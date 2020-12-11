package com.mysqlteers.tech_exam.service;

import com.mysqlteers.tech_exam.Model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService extends CrudService<Person, Long> {
    Optional<Person> findByName(String name);
    List<Person> findAllByOrderByName();
}
