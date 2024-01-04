package com.demo.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/newpage")
public class NewpageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public NewpageController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 System.out.println("entered do post method: ");
	 RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/views/newPage.jsp");
	 requestDispatcher.forward(request, response);
	}

}
