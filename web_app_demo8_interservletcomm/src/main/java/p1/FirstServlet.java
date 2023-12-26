package p1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/firstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FirstServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Entered do post method: ");
		//fetch the request parameter entered in UI - name
		String nameValue = request.getParameter("name");
		System.out.println("nameValue: " + nameValue);
		
		//setting nameValue to other varaible
		request.setAttribute("newMessage", nameValue);
		
		//redirecting to second servlet
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("secondServlet");
	    requestDispatcher.forward(request, response);
	}

}
