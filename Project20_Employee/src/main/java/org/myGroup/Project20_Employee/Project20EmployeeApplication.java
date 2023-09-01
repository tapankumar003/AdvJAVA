package org.myGroup.Project20_Employee;

import java.math.BigDecimal;

import org.myGroup.Project20_Employee.entities.FullTimeEmployee;
import org.myGroup.Project20_Employee.entities.PartTimeEmployee;
import org.myGroup.Project20_Employee.repository.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project20EmployeeApplication implements CommandLineRunner{

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private EmployeeRepository employeeRepository;
	public static void main(String[] args) {
		SpringApplication.run(Project20EmployeeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		employeeRepository.insert(new PartTimeEmployee("Jill", new BigDecimal("50")));
		employeeRepository.insert(new FullTimeEmployee("Jack", new BigDecimal("1000")));
		

		logger.info("All Employee -> {}",employeeRepository.retriveAllEmployee());
//		logger.info("All part time Employee -> {}",employeeRepository.retriveAllPartTimeEmployee());
//		logger.info("All full time Employee -> {}",employeeRepository.retriveAllFullTimeEmployee());
		
	}

}
