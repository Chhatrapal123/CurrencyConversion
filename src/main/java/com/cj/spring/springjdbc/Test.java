package com.cj.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cj/spring/springjdbc/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql = "insert into Student value(?,?,?,?,?,?)";
		int result = jdbcTemplate.update(sql,4,"CE",21,"Mumbai","Basketball","pratik");
		
		System.out.println("Number of records inserted are: "+result);
	}

}
