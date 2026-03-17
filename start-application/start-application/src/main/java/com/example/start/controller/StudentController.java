package com.example.start.controller;
import com.example.start.bean.Student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.start.bean.Student;

@RestController
public class StudentController {

    @GetMapping("/welcome")
    public String welcome() {
        return "Spring Boot Application";
    }
    
    @GetMapping("/get")
    public Student get()
    {
    	Student s=new Student(101,"Ram",98.25);
    	return s;
    	
    }
    
    @GetMapping("/findAll")
    public List<Student> findAll(){
    	List<Student> l1=new ArrayList<Student>();
    	l1.add(new Student(101,"Ram",99.25));
        l1.add(new Student(102, "Shyam", 88.50));
        l1.add(new Student(103, "Rahul", 91.75));
    	
    	
    	return l1;
    }
}