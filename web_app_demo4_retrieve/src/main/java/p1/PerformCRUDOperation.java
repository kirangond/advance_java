package p1;

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

@WebServlet("/crud")  // annotation used to conenct to UI form action
public class PerformCRUDOperation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Entered in to do post method:");
		//to fetch url header parameter with name attribute 
		String nameValue = request.getParameter("name");
		System.out.println("nameValue: " + nameValue);
		
		String cityValue = request.getParameter("city");
		System.out.println("cityValue: " + cityValue);
		
		String emailValue = request.getParameter("email");
		System.out.println("emailValue: " + emailValue);
		
		String mobileValue = request.getParameter("mobile");
		System.out.println("mobileValue: " + mobileValue);
		
		//connect with DB - first we need to add mysql connector jar in lib folder
		try {
			//to load the driver apache tomcat not able to load by default
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration","root","Kiran@123");
		    Statement createStatement = connection.createStatement();
		    //to insert values in to db
		    createStatement.executeUpdate("insert into crud values('"+nameValue+"','"+cityValue+"','"+emailValue+"','"+mobileValue+"')");
		    //to update row in db
//		    createStatement.executeUpdate("update crud set city='"+cityValue+"' where name='"+nameValue+"'");
		    //to delete row
//		    createStatement.executeUpdate("delete from crud where name='"+nameValue+"'");
		   //to read value from db
//		    ResultSet executeQuery = createStatement.executeQuery("select * from crud");
//		    System.out.println("executeQuery: " + executeQuery);
		    connection.close();
		} catch (SQLException | ClassNotFoundException e) {                                                      
			// TODO Auto-generated catch block
			System.out.println("Exception occured: ");
			e.printStackTrace();
		}
		
		
		
	}

}
