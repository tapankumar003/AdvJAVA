package org.myGroup.Project18_RelationshipJpaDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Review {
	@Id
	@GeneratedValue
	private int id;
	private String rating;
	private String description;

	public Review() {
		super();
	}

	public Review(int id, String rating, String description) {
		super();
		this.id = id;
		this.rating = rating;
		this.description = description;
	}

	public Review(String rating, String description) {
		super();
		this.rating = rating;
		this.description = description;
	}

	@ManyToOne
	private Course course;
	
	
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", rating=" + rating + ", description=" + description + "]";
	}

}
