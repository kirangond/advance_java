package com.demo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Login {
	
	public boolean verifyLogin(String email, String password, Connection connection)
	{
		
		Statement createStatement = null;
		ResultSet resultSet = null;
		try 
		{
			//keep db connection in other class because every time we need to connect to DB
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration","root","Kiran@123"); 
		    createStatement = connection.createStatement();
		    resultSet = createStatement.executeQuery("select * from user_details where email='"+email+"' and password='"+password+"'");
		   
		   if(resultSet.next())
			    return true;
		}
			
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			 System.out.println("Exception occured: ");
			e.printStackTrace();
		
	}
		return false;

}
	
}
