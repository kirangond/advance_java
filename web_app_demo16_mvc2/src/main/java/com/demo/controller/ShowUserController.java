package com.demo.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;

import com.demo.model.DatabaseConnection;
import com.demo.model.User;

@WebServlet("/showUserController")
public class ShowUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ShowUserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  System.out.println("entered get method of ShowUserController: ");
	  
	  
	  try {
		  DatabaseConnection db = new DatabaseConnection();
		  Connection conn = db.establishConnection();
		  
		  User user = new User();
		  ResultSet results = user.showRegistration(conn);
		  request.setAttribute("results", results);
		  RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/showRegistration.jsp");
	      rd.forward(request, response);
	  } catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	  
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
	}

}
