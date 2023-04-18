package com.cj.spring.springjdbc.student.Entity.dao.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.cj.spring.springjdbc.student.Entity.Student;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student stu = new Student();
		stu.setRoll_No(rs.getInt(1));
		stu.setStudent_Dept(rs.getString(2));
		stu.setStudent_Age(rs.getInt(3));
		stu.setStudent_city(rs.getString(4));
		stu.setEca(rs.getString(5));
		stu.setStudent_Name(rs.getString(6));
		return stu;
	}

}
