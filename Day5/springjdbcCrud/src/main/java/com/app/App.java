package com.app;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.ConfigurationFile;
import entity.Student;
import entitydao.EntityDaoImpl;

public class App {
    public static void main( String[] args ) throws Exception{
        System.out.println( "Here is Program for JDBC....!!!!" );
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationFile.class);
        EntityDaoImpl entityDao1=context.getBean(EntityDaoImpl.class);
//        int rs=entityDao1.setStudent(new Student(102,"Pratik Patil","Kagal"));
//        System.out.println(rs+" Rows Affected...!!");
        List<Student> students=entityDao1.getAllStudent();
        for(Student s:students) {
        	int i=0;
        	while(i<5) {
        		Thread.sleep(1500);
        		System.out.print(".");
        		i++;
        	}
        	System.out.println();
        	System.out.println(s);
        }
        
    }
}
