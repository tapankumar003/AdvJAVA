package org.myGroup.Project18_RelationshipJpaDemo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CourseRepository {

	@Autowired
	EntityManager em;


	
	
}
