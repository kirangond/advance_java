package p1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/firstServlet")
public class FirstServletSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FirstServletSession() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("do get method first servlet: ");
		String nameValue = request.getParameter("name");
		System.out.println("nameValue: " + nameValue);
		
		HttpSession session = request.getSession();
		session.setAttribute("msg", nameValue);
		
//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("secondServlet");
//		requestDispatcher.forward(request, response);
		
		//another way to call servlet
		response.sendRedirect("secondServlet");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
