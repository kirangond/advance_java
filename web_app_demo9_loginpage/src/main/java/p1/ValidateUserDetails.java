package p1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@WebServlet("/authenticate")
public class ValidateUserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ValidateUserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("validate user: do get method");
		
		try {
			//fetch the email and password
			String emailValue = request.getParameter("email");
			System.out.println("emailValue: " + emailValue);
			String passwordValue = request.getParameter("password");
			System.out.println("passwordValue: " + passwordValue);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration","root","Kiran@123");
		    Statement createStatement = connection.createStatement();
		    ResultSet executeQuery = createStatement.executeQuery("select * from user_details where email='"+emailValue+"' and password='"+passwordValue+"'");
		    
		    if(executeQuery.next())
		    {
		    	System.out.println("user is valid: ");
		    	RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/views/valid.html");
		    	requestDispatcher.forward(request, response);
		    }
		    else
		    {
		    	System.out.println("customer is invalid: ");
		    	RequestDispatcher requestDispatcher = request.getRequestDispatcher("WEB-INF/views/invalid.html");
		    	requestDispatcher.forward(request, response);
		    }
		    
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Exception occured: ");
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
