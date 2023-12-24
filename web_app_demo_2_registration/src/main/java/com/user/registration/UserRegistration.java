package com.user.registration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class UserRegistration
 */
/*
@WebServlet("/registrationServlet")
*/
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	//get method used to read data from form
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do Get method executed: ");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String city = request.getParameter("city");
		String emailId = request.getParameter("emailId");
		System.out.println("name: "+name);
		System.out.println("phone: "+phone);
		System.out.println("city: "+city);
		System.out.println("emailId: "+emailId);
		
	}

	//to write data into the form we use post method
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("do Post method executed: ");
	}

}
