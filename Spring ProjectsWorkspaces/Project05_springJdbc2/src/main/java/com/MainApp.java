package com;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.PlatformTransactionManager;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		EmployeeDao dao = (EmployeeDao) context.getBean("edao");
//		Employee e = new Employee();
//		e.setEid(124);
//		e.setEname("Anisha");
//		e.setAge(13);
//		e.setPassword("abcd123");
//		dao.addEmployee(e);
//		System.out.println("Record added");
//		
//		List<Employee> list = dao.getAllEmployee();
//		for(Employee emp: list) {
//			System.out.println(emp);
//		}
		
		List<Employee> lst = dao.getAllEmployeeOnAge(13);
		for(Employee emp: lst) {
			System.out.println(emp);
		}



}
}