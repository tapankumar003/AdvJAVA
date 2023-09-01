package org.myGroup.Project18_RelationshipJpaDemo.repository;

import org.myGroup.Project18_RelationshipJpaDemo.entity.Passport;
import org.myGroup.Project18_RelationshipJpaDemo.entity.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class StudentRepository {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	EntityManager em;
	
//	public void saveStudentWithPassport() {
//		Passport passport = new Passport("J9938");
//		em.persist(passport);
//		Student student = new Student("Jagan");
//		student.setPassport(passport);
//		em.persist(student);
//		
//	}
	
//	public void savePassportWithStudent() {
//		Student student = new Student("Nabin");
//		em.persist(student);
//		Passport passport = new Passport("V1441545");
//		passport.setStudent(student);
//		em.persist(passport);
//		
//	}
//	
	public void retrivePassportAssociateStudent() {
		
		Passport passport=em.find(Passport.class, 30002);
		logger.info("Passport info -> {}",passport);
		logger.info("Passport -> {}",passport.getStudent());
		
	}
}
