package com.mysqlteers.tech_exam.service.springdatajpa;

import com.mysqlteers.tech_exam.Model.Person;
import com.mysqlteers.tech_exam.repository.PersonRepository;
import com.mysqlteers.tech_exam.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class PersonJPA implements PersonService {
    private final PersonRepository pr;

    public PersonJPA(PersonRepository pr) {
        this.pr = pr;
    }


    @Override
    public Set<Person> findAll() {
        Set<Person> persons = new HashSet<>();
        pr.findAll().forEach(persons::add);
        return persons;
    }

    @Override
    public Person save(Person object) {
        return pr.save(object);
    }

    @Override
    public void delete(Person object) {
        pr.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        pr.deleteById(aLong);
    }

    @Override
    public Optional<Person> findById(Long aLong) {
        return pr.findById(aLong);
    }

    @Override
    public Optional<Person> findByName(String name) {
        return pr.findByName(name);
    }

    @Override
    public List<Person> findAllByOrderByName() {
        return pr.findAllByOrderByName();
    }
}
