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

/**
 * Servlet implementation class UpdateController
 */
@WebServlet("/updateController")
public class UpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 System.out.println("entered do get method of updateController");
	 String emailValue = request.getParameter("emailid");
	 System.out.println("emailValue: " + emailValue);
	 request.setAttribute("emailId", emailValue);
	 String cityName = request.getParameter("city");
	 System.out.println("emailValue: " + emailValue);
	 request.setAttribute("cityName", cityName);
	 
	 RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/views/upadateReg.jsp");
	 rd.forward(request, response);
	 
	 
	 
	 DatabaseConnection db = new DatabaseConnection();
	 Connection conn = db.establishConnection();
	 User user = new User();
	 user.updateRegistration(emailValue,conn);
	 
	 
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
