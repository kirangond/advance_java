package com.demo.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Connection;

import com.demo.model.DatabaseConnection;
import com.demo.model.Login;

@WebServlet("/loginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("entered into do post of LoginController servlet: ");
		String emailValue = request.getParameter("email");
		String passwordValue = request.getParameter("password");
		System.out.println("emailValue: " + emailValue + "passwordValue: " + passwordValue);
		DatabaseConnection databaseConnection = new DatabaseConnection();
		Connection establishConnection = databaseConnection.establishConnection();
		System.out.println("establishConnection: " + establishConnection);
	 Login login = new Login();
	 boolean verifyLogin = login.verifyLogin(emailValue, passwordValue,establishConnection);
	 System.out.println("verifyLogin result: " + verifyLogin) ;
	 HttpSession session = request.getSession(true);
	 if(verifyLogin==true)
	 {
		 session.setAttribute("emailId", emailValue);
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/views/userRegistration.jsp");
		 requestDispatcher.forward(request, response);
	 }else
	 {
		 request.setAttribute("error_message", "invalid username/password");
		 RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		 requestDispatcher.forward(request, response);
	 }
	 
	}

}
