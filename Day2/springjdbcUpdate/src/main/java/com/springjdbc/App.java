package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Student;
import springdao.StudentDaoImpl;
public class App {
    public static void main( String[] args ){

    	ApplicationContext context=new ClassPathXmlApplicationContext("springconfig/configuration.xml");
    	StudentDaoImpl sd1=(StudentDaoImpl) context.getBean("studentDaoImpl1");
    	Student s1=new Student();
    	s1.setId(105);
    	s1.setName("Avishkar Gurav");
    	s1.setAddress("Salegaon");
    	
    	int r1=sd1.insert(s1);
    	System.out.println("The "+r1+" Rows Affected....!!!");
    	
    	Student s2=new Student();
    	s2.setId(104);
    	s2.setName("Vishnu Gurav");
    	s2.setAddress("Salegaon");
    	int r2=sd1.update(s2);
    	
    	System.out.println("The "+r2+" Rows Affected....!!!!");
    	
    	
        
    }
}
