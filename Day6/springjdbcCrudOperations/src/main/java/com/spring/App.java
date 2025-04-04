package com.spring;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import configuration.ConfigurationFile;
import entity.Student;
import entitydao.StudentDaoImpl;
public class App {
    public static void main( String[] args ){
        System.out.println( "Here is My Program Startd....!!!!!" );
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationFile.class);
        StudentDaoImpl studentDaoImpl=context.getBean("getStudentDaoImpl",StudentDaoImpl.class);
//        Student student=new Student();
//        student.setId(103);
//        student.setName("Rohan Mane");
//        student.setAddress("Sangola");
        
        List<Student> students=studentDaoImpl.getAllStudents();
//        System.out.println(result+"The Rows Affected...!!");
        for(Student student:students) {
        	System.out.println(student);
        }
    }
}
