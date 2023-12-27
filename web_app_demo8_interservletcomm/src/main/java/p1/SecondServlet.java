package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/secondServlet")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SecondServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("entered do post of SecondServlet class: ");
		//of type Object hence convert into String 
//		Object attribute = request.getAttribute("newMessage");
		
		String attribute = (String) request.getAttribute("newMessage");
		System.out.println("attribute in second servlet : " + attribute);
		
		//printing back on UI
		PrintWriter writer = response.getWriter();
		writer.println("successfully able to get the name: " + attribute);
	}

}
