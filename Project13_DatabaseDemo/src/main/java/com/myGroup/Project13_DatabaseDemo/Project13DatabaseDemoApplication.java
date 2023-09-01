package com.myGroup.Project13_DatabaseDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.myGroup.Project13_DatabaseDemo.entity.Person;
import com.myGroup.Project13_DatabaseDemo.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class Project13DatabaseDemoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	PersonJdbcDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(Project13DatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.findAll());
		logger.info("By users Id 4 -> {}", dao.findById(4));
		logger.info("By users Name -> {}", dao.findByName("Apu"));
		logger.info("Insert person Id 5 -> {}", dao.insert(new Person(5,"Ankit","Lucknow","2000-06-30")));

		logger.info("Update 10003 -> {}", 
				dao.update(new Person(1, "Tapu", "bbsr", "1998-06-12")));
		//		logger.info(" person Id 1 -> {}",dao.update(new Person(1,"Tapu","BBSR","1998-06-12")));
//		1,'Tapu','Balasore','1998-06-12'
	}

}
