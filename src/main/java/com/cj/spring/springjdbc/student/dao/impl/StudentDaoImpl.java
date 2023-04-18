 package com.cj.spring.springjdbc.student.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cj.spring.springjdbc.student.Entity.Student;
import com.cj.spring.springjdbc.student.Entity.dao.StudentDao;
import com.cj.spring.springjdbc.student.Entity.dao.rowmapper.StudentRowMapper;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao
{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int create(Student student) {
		String sql = "insert into Student value(?,?,?,?,?,?)";
		int result = jdbcTemplate.update(sql, student.getRoll_No(),student.getStudent_Dept(),student.getStudent_Age(),student.getStudent_city(),student.getEca(),student.getStudent_Name());
		return result;
	}
	@Override
	public int update(Student student) {
		String sql = "update Student set Student_Name=?,Student_Age=? where Roll_No=?";
		int result = jdbcTemplate.update(sql, student.getStudent_Name(),student.getStudent_Age(),student.getRoll_No());
		return result;
	}
	@Override
	public int delete(int Roll_No) {
		String sql = "delete from Student where Roll_No=?";
		int result = jdbcTemplate.update(sql,Roll_No );
		return result;
	}
	@Override
	public Student read(int Roll_No) {
		
		String sql = "select * from Student where Roll_No=?";
		StudentRowMapper rowmapper = new StudentRowMapper();
		
		//Student student = (Student) this.jdbcTemplate.queryForObject(sql, rowmapper, Roll_No);
		Student student=(Student)this.jdbcTemplate.queryForObject(sql,rowmapper,Roll_No);
		return student;
	}
	@Override
	public List<Student> read() {
		String sql = "select * from Student";
		StudentRowMapper rowmapper = new StudentRowMapper();
		List<Student> result = jdbcTemplate.query(sql, rowmapper);
		return result;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
