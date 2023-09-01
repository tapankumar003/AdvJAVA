package com;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee e = new Employee();
		e.setEid(rs.getInt("eid"));
		e.setEname(rs.getString("ename"));
		e.setAge(rs.getInt("age"));
		e.setPassword(rs.getString("password"));
		return e;
	}

}
