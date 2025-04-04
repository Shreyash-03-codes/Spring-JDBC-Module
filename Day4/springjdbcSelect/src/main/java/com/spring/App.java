package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Student;
import studentdao.StudentDaoImpl;



public class App {
    public static void main( String[] args ){
        System.out.println( "Here is Spring JDBC.....!!!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("config/configuration.xml");
        StudentDaoImpl std=context.getBean("studentDaoImpl1",StudentDaoImpl.class);
        
      
        
        List<Student> list=std.getAllStudents();
        for(Student s:list) {
        	System.out.println(s);
        }
       
        
        
        
    }
}
