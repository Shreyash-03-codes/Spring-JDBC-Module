package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import entity.Student;
import studentdao.StudentDaoImpl;

public class App {
    public static void main( String[] args ){
    	ApplicationContext context=new ClassPathXmlApplicationContext("springconfig/configuration.xml");
    	StudentDaoImpl sd1=(StudentDaoImpl) context.getBean("studentDaoImpl1");
    	Student s1=new Student();
    	s1.setId(101);
    	s1.setName("Shreyash Gurav");
    	s1.setAddress("Salegaon");
    	int result=sd1.delete(s1);
    	System.out.println("The "+result+" Rows Iffected....!!!!");
    }
}
