package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

public class ThirdServletSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ThirdServletSession() {
		super();
		// TODO Auto-generated constructor stub
	}
	//same browser
	//http://localhost:8080/web_app_demo10_sessions/ThirdServletSession
	//o/p attributeSessionValue: kirangond

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("by default do get method executed: when we run servlet directly in container:");
	   HttpSession session = request.getSession();	
	   String attributeSessionValue = (String) session.getAttribute("msg");
	   PrintWriter writer = response.getWriter();
	   writer.print("attributeSessionValue: " +attributeSessionValue);
	   }

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
