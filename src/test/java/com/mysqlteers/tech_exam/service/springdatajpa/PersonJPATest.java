package com.mysqlteers.tech_exam.service.springdatajpa;

import com.mysqlteers.tech_exam.Model.Person;
import com.mysqlteers.tech_exam.service.PersonService;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PersonJPATest {
    @Autowired
    PersonService personService;

    String TEST_NAME = "Testnavn";

    @Test
    @Order(2)
    void findAll() {
        assertTrue(personService.findAll().size() > 0);
    }

    @Test
    @Order(1)
    void save() {
        Person person = new Person();
        person.setName(TEST_NAME);
        assertNotNull(personService.save(person));
    }

    @Test
    @Order(4)
    void delete() {
        Person person = personService.findByName(TEST_NAME).get();
        personService.delete(person);
        assertTrue(personService.findByName(TEST_NAME).isEmpty());
    }

    @Test
    @Order(5)
    void deleteById() {
        Person newPerson = personService.save(new Person());
        personService.deleteById(newPerson.getId());
        System.out.println(newPerson.getId());
        assertTrue(personService.findById(newPerson.getId()).isEmpty());
    }

    @Test
    @Order(3)
    void findById() {
        Person person = personService.findByName(TEST_NAME).get();
        assertEquals(person.getName(), personService.findById(person.getId()).get().getName());
    }
}