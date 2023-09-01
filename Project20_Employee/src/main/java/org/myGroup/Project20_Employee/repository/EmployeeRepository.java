package org.myGroup.Project20_Employee.repository;

import java.util.List;

import org.myGroup.Project20_Employee.entities.Employee;
import org.myGroup.Project20_Employee.entities.FullTimeEmployee;
import org.myGroup.Project20_Employee.entities.PartTimeEmployee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class EmployeeRepository {

	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	EntityManager em;
	
	public void insert(Employee employee) {
		em.persist(employee);
		
	}
	
	public List<Employee> retriveAllEmployee(){
		return em.createQuery("select e from Employee e", Employee.class).getResultList();
	}
//	public List<PartTimeEmployee> retriveAllPartTimeEmployee(){
//		return em.createQuery("select e from PartTimeEmployee e", PartTimeEmployee.class).getResultList();
//	}
//	
//	public List<FullTimeEmployee> retriveAllFullTimeEmployee(){
//		return em.createQuery("select e from FullTimeEmployee e", FullTimeEmployee.class).getResultList();
//	}
	
}
