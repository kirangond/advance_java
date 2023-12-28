package com.calculation.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.calculation.model.AddNumbers;

@WebServlet("/addTwoNumber")
public class AddNumberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddNumberServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Entered do post method: ");
		//fetch the num1 and num2 from the form header parameter
		//by default entered value will be string so we need to convert into interger using wrapper class
		//String num1Value = request.getParameter("num1");
		
		//we need to handle the exception for bad input
		try {
		int num1Value =  Integer.parseInt(request.getParameter("num1"));
		int num2Value =  Integer.parseInt(request.getParameter("num2"));
		System.out.println("num1Value  : " + num1Value + " num2Value  : " + num2Value);
		//we need to call add logic method
		AddNumbers obj = new AddNumbers();
		int result = obj.add(num1Value, num2Value);
		System.out.println("result: " + result);
		
		//result we need to display on UI so set into new variable
		request.setAttribute("resultUI", result);
		
		//remain on the same after clicking on add
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
		requestDispatcher.forward(request, response);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured setting o/p as invalid input: ");
			request.setAttribute("error_message", "invalid_input");
			RequestDispatcher requestDispatcher1 = request.getRequestDispatcher("index.jsp");
			requestDispatcher1.forward(request, response);
		}
	}

}
