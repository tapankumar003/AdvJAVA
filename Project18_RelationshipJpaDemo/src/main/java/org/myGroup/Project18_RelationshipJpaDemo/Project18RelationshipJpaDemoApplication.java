package org.myGroup.Project18_RelationshipJpaDemo;

import org.myGroup.Project18_RelationshipJpaDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project18RelationshipJpaDemoApplication implements CommandLineRunner{
	
	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(Project18RelationshipJpaDemoApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	//	studentRepository.saveStudentWithPassport();
//		studentRepository.retrivePassportAssociateStudent();
		studentRepository.retrivePassportAssociateStudent();
	}
}
