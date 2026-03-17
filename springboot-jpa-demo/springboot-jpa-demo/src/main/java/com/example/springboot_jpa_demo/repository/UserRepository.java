package com.example.springboot_jpa_demo.repository;

import com.example.springboot_jpa_demo.entity.*;
import org.springframework.data.jpa.repository.config.JpaRepositoryConfigExtension;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{

}
