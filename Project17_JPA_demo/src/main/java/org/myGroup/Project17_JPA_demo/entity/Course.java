package org.myGroup.Project17_JPA_demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {

	@Id
	@GeneratedValue
	private int CourseId;
	private String courseName;

	public Course() {
		super();
	}

	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}
    
	
	
	public Course(int courseId, String courseName) {
		super();
		CourseId = courseId;
		this.courseName = courseName;
	}

	public int getCourseId() {
		return CourseId;
	}

	public void setCourseId(int courseId) {
		CourseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [CourseId=" + CourseId + ", courseName=" + courseName + "]";
	}

}
