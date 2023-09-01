package com.myGroup.Project13_DatabaseDemo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.myGroup.Project13_DatabaseDemo.entity.Person;




@Repository
public class PersonJdbcDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	
	class PersonRowMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			Person person = new Person();
			person.setId(rs.getInt("id"));
			person.setName(rs.getString("name"));
			person.setLocation(rs.getString("location"));
			person.setDob(rs.getString("dob"));
			return person;
		}
		
	}
	
	
	public List<Person> findAll(){
		return jdbcTemplate.query("select * from person",
				new PersonRowMapper());
				//new BeanPropertyRowMapper(Person.class));	
	}
	public Person findById(int id){
		return jdbcTemplate.queryForObject("select * from person where id =?",new Object[] {id},
				new BeanPropertyRowMapper<Person>(Person.class));	
	}
	public Person findByName(String name){
		return jdbcTemplate.queryForObject("select * from person where name =?",new Object[] {name},
				new BeanPropertyRowMapper<Person>(Person.class));	
	}
	public int DeleteById(int id){
		return jdbcTemplate.update("delete from person where id =?",new Object[] {id});	
	}
	public int insert(Person person){
		return jdbcTemplate.update("insert into person (id, name, location, dob)"
				+ "values(?, ?, ?, ?)",
				new Object[] {person.getId(), person.getName(), person.getLocation(), person.getDob()		
				});	
	}

	public int update(Person person) {
		return jdbcTemplate.update("update person " + " set name = ?, location = ?, dob = ? " + " where id = ?",
				new Object[] { person.getName(), person.getLocation(), person.getDob(),
						person.getId()});
	}	
}