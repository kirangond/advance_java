package com.validate;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/validateUserSession")
public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ValidateServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("do post method: ");
	
		String nameValue = request.getParameter("name");
		System.out.println("nameValue: " + nameValue);
		String passwordValue =  request.getParameter("password");
		System.out.println("passwordValue: " + passwordValue);
		
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration","root","Kiran@123");
		    Statement createStatement = connection.createStatement();
		    ResultSet executeQuery = createStatement.executeQuery("select * from user_details where email='"+nameValue+"' and password='"+passwordValue+"'");
		    //creating first time session 
		    HttpSession session = request.getSession(true);
		    if(executeQuery.next())
		    {
		    	System.out.println("authenticated the user: ");
		    	
		    	session.setAttribute("username", nameValue);
		    	Object attribute = session.getAttribute("username");
		    	System.out.println("attribute: " + attribute);
		    	RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/views/home.html");
		    	requestDispatcher.forward(request, response);
		    	
		    	
		    }
		    else
		    {
		    	System.out.println("not valid user remain on same page:");
		    	RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("index.html");
		    	requestDispatcher1.forward(request, response);
		    	}
		}
				
		 catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			 System.out.println("Exception occured: " + e +"/n");
			e.printStackTrace();
		}
	}
	

}
