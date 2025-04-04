package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import entity.Student;
import springdao.SpringEntityDao;

public class App {
    public static void main( String[] args ){
    	
    	ApplicationContext context =new ClassPathXmlApplicationContext("configuration.xml");
    	
    	SpringEntityDao dao=(SpringEntityDao) context.getBean("springEntityDao");
    	int result=dao.insert(new Student(103,"Bhagwan Gurav","Salegaon"));
    	System.out.println(result+"Row Affected ....!");
    }
}
