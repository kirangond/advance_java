package com.validate;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/logoutServlet")
public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LogoutServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("do post of logoutServlet: ");
		
		//if true it will create new session, false it will use existing session attribute
		HttpSession session = request.getSession(false);
		String sessionValue = (String) session.getAttribute("username");
		System.out.println("sessionValue: " + sessionValue);
		//it will destroy the session
		session.invalidate();
		
		//we can't use after destroying session it will throw an error 
		session.getAttribute("username");
		
		
	}

}
