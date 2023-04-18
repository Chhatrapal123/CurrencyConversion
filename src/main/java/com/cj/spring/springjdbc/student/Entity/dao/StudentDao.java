package com.cj.spring.springjdbc.student.Entity.dao;

import java.util.List;

import com.cj.spring.springjdbc.student.Entity.Student;

public interface StudentDao 
{
	int create(Student student);
	int update(Student student);
	int delete(int Roll_No);
	Student read(int Roll_No);
	List<Student> read();

}
