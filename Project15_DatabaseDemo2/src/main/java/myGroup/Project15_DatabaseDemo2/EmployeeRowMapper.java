package myGroup.Project15_DatabaseDemo2;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEmpId(rs.getInt("empId"));
		emp.setEmpName(rs.getString("empName"));
		emp.setEmpAdr(rs.getString("empAdr"));
		return emp;
	}

}
