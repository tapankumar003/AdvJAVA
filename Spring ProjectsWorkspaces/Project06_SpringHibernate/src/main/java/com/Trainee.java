package com;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Trainee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int traineeId;
	private String traineeName;
	private int age;
	
	
	
	public Trainee() {
		super();
	}
	public Trainee(String traineeName, int age) {
		super();
		this.traineeName = traineeName;
		this.age = age;
	}
	public int getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName=" + traineeName + ", age=" + age + "]";
	}
	
	

}
