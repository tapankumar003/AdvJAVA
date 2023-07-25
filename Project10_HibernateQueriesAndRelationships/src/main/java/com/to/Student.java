package com.to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	@Column(nullable = false)
	private String studentName;
	private int age;
	private String className;
	
	
	
	public Student() {
		
	}
	
	
	
	public Student(String studentName, int age, String className) {
		super();
		this.studentName = studentName;
		this.age = age;
		this.className = className;
	}



	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", studentName=" + studentName + ", age=" + age + ", className="
				+ className + "]";
	}
	
	
	

}
