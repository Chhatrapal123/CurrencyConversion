package com.cj.spring.springjdbc.student.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cj.spring.springjdbc.student.Entity.Student;
import com.cj.spring.springjdbc.student.Entity.dao.StudentDao;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cj/spring/springjdbc/student/test/config.xml");
		StudentDao dao = (StudentDao) ctx.getBean("studentDao");
		
		System.out.println("Data Operation Processing....");
		
		/*Student student = new Student();
		student.setRoll_No(3);
		student.setStudent_Dept("CE");
		student.setStudent_Age(26);
		student.setStudent_city("Nagpur");
		student.setEca("Singing");
		student.setStudent_Name("Abhishek");*/
		
//		int result = dao.create(student); // create table
//		int result = dao.update(student);// update Row
//		int result = dao.delete(2);
//		Student student = dao.read(3);
		List<Student> result = dao.read();
		for(Student student:result)
		{
			System.out.println(student);
		}
		
//		System.out.println("Insertion completed...Number of records inserted are: "+result);
//		System.out.println("updation completed...Number of records updatede are: "+result);
//		System.out.println("deletion completed...Number of records deleted are: "+result);
//		System.out.println("Student Record "+ student);
		System.out.println("Student Record "+ result);
	}

}
 