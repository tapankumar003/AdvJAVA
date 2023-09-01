package org.myGroup.Project17_JPA_demo;

import org.myGroup.Project17_JPA_demo.entity.Course;
import org.myGroup.Project17_JPA_demo.repository.CourseRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project17JpaDemoApplication implements CommandLineRunner{
	
	@Autowired
	private CourseRepository repository;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	public static void main(String[] args) {
		SpringApplication.run(Project17JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Course details -> 101 {}",repository.findById(101));
		
		repository.deleteById(103);
		
		repository.Insert(new Course("Math"));
		repository.Update(new Course(2,"Physice"));
	}

}
