package com.demo.model;

import java.sql.Connection;
import java.sql.ResultSet;
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

	public ResultSet showRegistration(Connection conn) {
		try {
			Statement createStatement = conn.createStatement();
			ResultSet result = createStatement.executeQuery("select * from registration");
			return result;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return null;
	}
	
	public void deleteRegistration(String emailId, Connection conn)
	{
		try {
			Statement createStatement = conn.createStatement();
			createStatement.executeUpdate("delete from registration where email='"+emailId+"'");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	public void updateRegistration(String emailId, Connection conn)
	{
		try {
			Statement createStatement = conn.createStatement();
			createStatement.executeUpdate("update registration set city='"+null+"' where email='"+emailId+"'");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
