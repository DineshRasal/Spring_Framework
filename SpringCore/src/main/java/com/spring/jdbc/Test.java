package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

    public static void main(String[] args) {

        System.out.println("My program Is running");

        ApplicationContext context =
                new ClassPathXmlApplicationContext("com/spring/jdbc/Config.xml");

        JdbcTemplate template = context.getBean("jdbcTemplate", JdbcTemplate.class);

        String sql="insert into student(id,name,city) values(?,?,?)";
        
        int result =template.update(sql,102,"Dinesh","Nagar");
        System.out.println("Record Inserted"+result);
    }
}