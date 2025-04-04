package com.spring;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.Student;
import entitydao.StudentDaoImpl;
public class App {
    public static void main( String[] args ){
        System.out.println( "Here is Program is Started...!!!!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("configuration/Configuration.xml");
        StudentDaoImpl studentDaoImpl=context.getBean("studentDaoImpl1",StudentDaoImpl.class);
//        Student student=new Student();
//        student.setId(104);
//        student.setName("Nitish Dighe");
//        student.setAddress("Sangola");
//        Student student=studentDaoImpl.getStudentById(101);
////        System.out.println(rs+" Rows Affected....!!!");
//        System.out.println(student);
        
        List<Student> students=studentDaoImpl.getAllStudents();
        for(Student student:students) {
        	System.out.println(student);
        }
    }
}
