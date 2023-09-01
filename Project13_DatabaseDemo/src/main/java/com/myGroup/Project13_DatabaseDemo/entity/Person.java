package com.myGroup.Project13_DatabaseDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Person {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String location;
	private String dob;
	
	
	public Person() {
		super();
	}
	
	public Person(int id, String name, String location, String dob) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.dob = dob;
	}
	
	
	
	public Person(String name, String location, String dob) {
		super();
		this.name = name;
		this.location = location;
		this.dob = dob;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "\nPerson [id=" + id + ", name=" + name + ", location=" + location + ", dob=" + dob + "]";
	}
	
	

}
