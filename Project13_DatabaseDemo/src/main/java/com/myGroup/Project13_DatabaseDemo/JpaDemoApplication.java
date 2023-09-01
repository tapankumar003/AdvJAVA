package com.myGroup.Project13_DatabaseDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myGroup.Project13_DatabaseDemo.entity.Person;
import com.myGroup.Project13_DatabaseDemo.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner{

	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJpaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Inserting -> {}", 
				repository.insert(new Person("Tara", "Berlin", "dob")));
		logger.info("User id 1 -> {}",repository.findById(1));
		
		
	}
}
