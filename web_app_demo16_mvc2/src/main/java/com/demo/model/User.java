package com.demo.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class User {
	
	public void addRegistration(String firstName, String lastName, String emailName,  String cityName, Connection conn)
	{
		try {
			Statement createStatement = conn.createStatement();
			createStatement.executeUpdate("insert into registration values ('"+firstName+"','"+lastName+"','"+emailName+"','"+cityName+"')");
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
