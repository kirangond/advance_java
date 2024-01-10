package prepared.statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateRecord {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/user_registration","root","Kiran@123");
			PreparedStatement ps = connection.prepareStatement("insert into statement values (?,?)");
			ps.setString(1, "pavan@gmail.com");
			ps.setString(2, "123");
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
