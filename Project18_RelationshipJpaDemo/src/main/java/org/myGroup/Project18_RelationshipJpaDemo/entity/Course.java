package org.myGroup.Project18_RelationshipJpaDemo.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Course {

	@Id
	@GeneratedValue
	private int id;
	private String name;

	public Course() {
		super();
	}

	public Course(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Course(String name) {
		super();
		this.name = name;
	}

	@OneToMany(mappedBy = "course")
	private List<Review> reviews = new ArrayList<Review>();
	
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
	
	

	public void addReviews(Review review) {
		
		this.reviews.add(review);
	}

	public void removeReviews(Review review) {
		this.reviews.remove(review);
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", reviews=" + reviews + "]";
	}


	
}
