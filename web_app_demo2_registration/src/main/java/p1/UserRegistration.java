package p1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/regitration")
public class UserRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("entered do get method: ");
		
		String name = request.getParameter("name");
		System.out.println("name: "  + name);
		
		String city = request.getParameter("city");
		System.out.println("city: "  + city);	
		
		String number = request.getParameter("phone_no");
		System.out.println("number: "  + number);
		
		String dummy = request.getParameter("dummy");
		System.out.println("dummy: "  + dummy);
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration", "root", "Kiran@123");
		    Statement createStatement = connection.createStatement();
		    createStatement.executeUpdate("insert into details values('"+name+"','"+city+"','"+number+"')");
		    connection.close();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("entered do post method: ");
	}

}
