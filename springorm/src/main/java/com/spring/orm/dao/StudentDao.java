package com.spring.orm.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.orm.entities.Student;

@Transactional
public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    // INSERT
    public int insert(Student student) {
        Integer i = (Integer) this.hibernateTemplate.save(student);
        return i;
    }
    
    //Get The Single data(Object)
    public Student getStudent(int studentId) {
    	Student student = this.hibernateTemplate.get(Student.class,studentId);
    	return student;
    }

    //Get All Data
    public List<Student> getAllStudent(){
    	List<Student> students = this.hibernateTemplate.loadAll(Student.class);
    	return students;
    }
    
    //Deleting The Data
    public void deleteStudent(int studentId) {
    	Student student = this.hibernateTemplate.get(Student.class, studentId);
    	this.hibernateTemplate.delete(student);
    }
    
    //Updating Data
    
    public void updtaeStudent(Student student) {
    	this.hibernateTemplate.update(student);
    }
    // Setter for Dependency Injection
    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}