package org.myGroup.Project17_JPA_demo.repository;

import org.myGroup.Project17_JPA_demo.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseRepository {

	@Autowired
	EntityManager em;
	
	public Course findById(int CourseId) {
		return em.find(Course.class, CourseId);
	}
	
	public void deleteById(int id) {
		Course course = findById(id);
		em.remove(course);
	}

	public Course Insert(Course course) {
		em.persist(course);
		return course;
	}
	public Course Update(Course course) {
		em.merge(course);
		return course;
		
	}
	
}
