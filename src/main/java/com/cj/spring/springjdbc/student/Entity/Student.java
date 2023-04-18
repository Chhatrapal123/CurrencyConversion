package com.cj.spring.springjdbc.student.Entity;

public class Student 
{
	private int Roll_No;
	private String Student_Dept;
	private int Student_Age;
	private String Student_city;
	private String eca;
	private String Student_Name;
	public int getRoll_No() {
		return Roll_No;
	}
	public void setRoll_No(int roll_No) {
		Roll_No = roll_No;
	}
	public String getStudent_Dept() {
		return Student_Dept;
	}
	public void setStudent_Dept(String student_Dept) {
		Student_Dept = student_Dept;
	}
	public int getStudent_Age() {
		return Student_Age;
	}
	public void setStudent_Age(int student_Age) {
		Student_Age = student_Age;
	}
	public String getStudent_city() {
		return Student_city;
	}
	public void setStudent_city(String student_city) {
		Student_city = student_city;
	}
	public String getEca() {
		return eca;
	}
	public void setEca(String eca) {
		this.eca = eca;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
	}
	@Override
	public String toString() {
		return "Student [Roll_No=" + Roll_No + ", Student_Dept=" + Student_Dept + ", Student_Age=" + Student_Age
				+ ", Student_city=" + Student_city + ", eca=" + eca + ", Student_Name=" + Student_Name + "]";
	}
}
