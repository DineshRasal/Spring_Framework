package com.rasal.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rasal.springboot.model.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {

}