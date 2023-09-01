package com.myGroup.Project13_DatabaseDemo.jpa;

import org.springframework.stereotype.Repository;

import com.myGroup.Project13_DatabaseDemo.entity.Person;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PersonJpaRepository {

//	connect to database
	@PersistenceContext
	EntityManager entityManager;
	
	public Person insert(Person person) {
		return entityManager.merge(person);
	}
	
	public Person findById(int id) {
		return entityManager.find(Person.class, id);
	}
	
}
