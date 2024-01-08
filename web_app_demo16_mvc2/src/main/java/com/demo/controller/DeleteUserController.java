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

@WebServlet("/deleteController")
public class DeleteUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteUserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 System.out.println("by dafault do get method called due to link");
	 String emailId =  request.getParameter("emailid");
	 System.out.println("emailId: "+emailId);
	 
	 try {
		DatabaseConnection db = new DatabaseConnection();
		Connection conn = db.establishConnection();
		
		User user = new User();
		user.deleteRegistration(emailId, conn);
		//null due to results set its not there in this class
		ResultSet showRegistration = user.showRegistration(conn);
		request.setAttribute("results", showRegistration);
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/showRegistration.jsp");
		rd.include(request, response);
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	 
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
