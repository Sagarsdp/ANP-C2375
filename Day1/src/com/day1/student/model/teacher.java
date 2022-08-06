package com.day1.student.model;

public class teacher {
	
	private int TeacherId;
	private char Name;
	private int Tage;
	
	public teacher(){
		TeacherId =19;
		Name='T';
		Tage=30;
		
		System.out.println("constructorr teacher called");
	}

	public int getTeacherId() {
		return TeacherId;
	}

	public void setTeacherId(int teacherId) {
		TeacherId = teacherId;
	}

	public char getName() {
		return Name;
	}

	public void setName(char name) {
		Name = name;
	}

	public int getTage() {
		return Tage;
	}

	public void setTage(int tage) {
		Tage = tage;
	}
	

}
