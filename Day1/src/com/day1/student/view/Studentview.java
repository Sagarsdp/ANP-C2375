package com.day1.student.view;
import com.day1.student.model.Student;
import com.day1.student.model.teacher;
public class Studentview {
	public static void main(String[] args) {
		
		Student obj1= new Student();
		System.out.println(obj1.getStudentname());
		System.out.println(obj1.getStudentRollNo());
		
		teacher obj2=new teacher();
		
		System.out.println(obj2.getTeacherId());
		System.out.println(obj2.getName());
		
		Student obj3= new Student(1,'q',19);
		System.out.println(obj3.getStudentname()+"  "+obj3.getStudentRollNo()+" "+obj3.getAge());
	}
}
