package com;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class EmployeeDao {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.dataSource=dataSource;
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
	
	public void addEmployee(Employee e) {
		String SQL = "insert into employee values(?, ?, ?, ?)";
		jdbcTemplate.update(SQL, e.getEid(), e.getEname(), e.getAge(), e.getPassword());
	}
	
	public List<Employee> getAllEmployee(){
		String SQL = "select * from employee";
		List<Employee> employees = jdbcTemplate.query(SQL, new EmployeeMapper());
		return employees;
		
	}
	public List<Employee> getAllEmployeeOnAge(int age){
		String sql = "select * from employee where age=?";
		List<Employee> mylist =jdbcTemplate.query(sql, new EmployeeMapper(),age);
		return mylist;
	}
		
	
}
