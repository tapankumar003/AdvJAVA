package myGroup.Project15_DatabaseDemo2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<Employee> getAllEmp(){
		return jdbcTemplate.query("select * from employee",
				new EmployeeRowMapper());
	}
	
}
