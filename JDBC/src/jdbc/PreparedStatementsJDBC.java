package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PreparedStatementsJDBC{
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ottplatform","root","Lokesh@123");
		PreparedStatement pst = connection.prepareStatement("insert into movies value(?,?,?)");
		pst.setInt(1, 101);
		pst.setString(2, "Bahubali");
		pst.setInt(3, 2);
		pst.executeUpdate();
		PreparedStatement pst1 = connection.prepareStatement("insert into movies value(?,?,?)");
		pst1.setInt(1, 102);
		pst1.setString(2,"Dasara");
		pst1.setInt(3,2);
		pst1.executeUpdate(); 
		PreparedStatement pst2 = connection.prepareStatement("insert into movies values(?,?,?)");
		pst2.setInt(1, 103);
		pst2.setString(2, "Virupaksha");
		pst2.setInt(3, 2);
		pst2.executeUpdate(); 
		System.out.println("Done");
		//PreparedStatement pst3 = connection.prepareStatement("delete from movies where id=103");
		//pst3.executeUpdate();
		//PreparedStatement pst4 = connection.prepareStatement("alter table movies");
		//pst4.executeUpdate();
	}
}