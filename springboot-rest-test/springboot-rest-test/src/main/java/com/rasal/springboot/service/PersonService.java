package com.rasal.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.rasal.springboot.exception.PersonNotFoundException;
import com.rasal.springboot.model.Person;
import com.rasal.springboot.repository.PersonRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PersonService {

    private PersonRepository personRepository;

    public Person createPerson(Person person) {
        return personRepository.save(person);
    }

    public Person getPersonById(Long id) {
        return personRepository.findById(id).orElseThrow(()-> new PersonNotFoundException("Person Not Found With Mentioned Id"));
    }

    public List<Person> getAllPerson() {
        return personRepository.findAll();
    }

    public String deletePerson(Long id) {
        personRepository.deleteById(id);
        return "Person Deleted Successfully";
    }

    public Person updatePerson(Long id, Person person) {
        Person existingPerson = personRepository.findById(id).orElse(null);

        if (existingPerson != null) {
            existingPerson.setName(person.getName());
            existingPerson.setEmail(person.getEmail());
            return personRepository.save(existingPerson);
        }

        return null;
    }
}