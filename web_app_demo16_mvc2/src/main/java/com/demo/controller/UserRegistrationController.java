package com.demo.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

import com.demo.model.DatabaseConnection;
import com.demo.model.User;

@WebServlet("/userRegistration")
public class UserRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UserRegistrationController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 System.out.println("by default it will load do get method: ");
	 RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/userRegistration.jsp");
	 rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 System.out.println("entered do post method:");
	 String firstName = request.getParameter("firstname");
	 String lastName = request.getParameter("lastname");
	 String emailName = request.getParameter("emailname");
	 String cityName = request.getParameter("cityname");
	 System.out.println("firstName: " + firstName);
	 System.out.println("lastName: " + lastName);
	 System.out.println("emailName: " + emailName);
	 System.out.println("cityName: " + cityName);
	 
	 DatabaseConnection db = new DatabaseConnection();
	 Connection conn = db.establishConnection();
	 
	 User user = new User();
	 user.addRegistration( firstName,  lastName,  emailName,   cityName, conn);
	 
	 request.setAttribute("msg", "data inserted successfully");
	RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/userRegistration.jsp");
	 rd.include(request, response);
	}

}
