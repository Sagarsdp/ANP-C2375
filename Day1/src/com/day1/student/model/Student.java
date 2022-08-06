package com.day1.student.model;

public class Student {
	private int StudentRollNo;
	private char Studentname;
	private int age;
	
	
	public Student()
	{
		StudentRollNo =1;
		Studentname='A';
		age =21;
		System.out.println("Non parametrized constructor called");
	}
	public Student(int a,char name,int b) {
		StudentRollNo=a;
		Studentname=name;
		age=b;
		System.out.println("parametrized constructor called");
	
	}
	public int getStudentRollNo() {
		return StudentRollNo;
	}
	public void setStudentRollNo(int studentRollNo) {
		StudentRollNo = studentRollNo;
	}
	public char getStudentname() {
		return Studentname;
	}
	public void setStudentname(char studentname) {
		Studentname = studentname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}


