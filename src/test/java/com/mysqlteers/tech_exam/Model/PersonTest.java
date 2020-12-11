package com.mysqlteers.tech_exam.Model;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class PersonTest {

    @Test
    @Order(1)
    public void canCreatePersonObject() {
        assertNotNull(new Person());
    }

    @Test
    @Order(2)
    public void canReadAndUpdatePersonObject() {
        Person person = new Person();
        person.setAge(55);
        assertEquals(55, person.getAge());
    }
}