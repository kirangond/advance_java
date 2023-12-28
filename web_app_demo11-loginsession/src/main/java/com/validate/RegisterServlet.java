package com.validate;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.websocket.Session;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/registerServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public RegisterServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("entered do post method of registerServlet: ");
		
		String name = request.getParameter("name");
		System.out.println("name: "  + name);
		
		String city = request.getParameter("city");
		System.out.println("city: "  + city);	
		
		String email = request.getParameter("email");
		System.out.println("email: "  + email);
		
		String number = request.getParameter("phone");
		System.out.println("number: "  + number);
		
		HttpSession session = request.getSession();
		String attributeSessionValue = (String) session.getAttribute("username");
		System.out.println("attributeSessionValue : " + attributeSessionValue);
		
	  if(attributeSessionValue!=null)
	  {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration", "root", "Kiran@123");
		    Statement createStatement = connection.createStatement();
		    createStatement.executeUpdate("insert into register values('"+name+"','"+city+"','"+email+"','"+number+"')");
		    connection.close();
		    PrintWriter writer = response.getWriter();
		    writer.println("register successful:");
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	else
	{
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.html");
		requestDispatcher.forward(request, response);
	}

}
}
