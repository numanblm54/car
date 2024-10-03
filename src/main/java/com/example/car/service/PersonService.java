package com.example.car.service;

import java.util.List;

import com.example.car.model.Person;

public interface PersonService {
    void createPerson(Person person);
    Person getPersonById(Long id);
    List<Person> getAllPersons();
    void updatePerson(Person person);
    void deletePerson(Long id);
}
