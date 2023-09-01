package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcExample {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","toor");
		Statement stmt = con.createStatement();
//		ResultSet rs = stmt.executeQuery("select * from user");
//		
//		while(rs.next()) {
//			int id_ = rs.getInt("id");
//			String name_ = rs.getString("name");
//			
//			System.out.println(id_ + " "+name_);
//		}
		String SQL = "insert into user (id,name) values(1003,'Toshib')";
        stmt.executeUpdate(SQL);
		stmt.close();
		con.close();

	}

}
