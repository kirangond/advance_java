package p1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DirectAccess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public DirectAccess() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("request: " + request);
		System.out.println("response: " + response);
		System.out.println("by default do get method executed when we run Servlet directly: ");
		//to print on UI
		PrintWriter writer = response.getWriter();
		writer.println("printing back on UI from DirectAccess Servlet doGet method: ");
	    //redirecting to other page
		RequestDispatcher redirectToOtherPgae = request.getRequestDispatcher("WEB-INF/views/nodirectaccess.html");
		redirectToOtherPgae.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
