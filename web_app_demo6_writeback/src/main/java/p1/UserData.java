package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public UserData() {
		super();
	}

	//correct path in UI to load resource: http://localhost:8080/web_app_demo6_writeback/UserData
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	//	System.out.println("do get method by default executed: ");
		PrintWriter writer = response.getWriter();
		writer.println("kiran");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
