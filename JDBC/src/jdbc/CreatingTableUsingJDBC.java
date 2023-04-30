package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreatingTableUsingJDBC{
	static Statement statement = null;
	static Connection connection = null;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CreatingTableUsingJDBC.getConnection();
		//CreatingTableUsingJDBC.creatingTable();
		//CreatingTableUsingJDBC.deleteTable();
	}
	static void getConnection() throws ClassNotFoundException, SQLException {
		//load jdbc driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//getting connection
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ottplatform","root","Lokesh@123");
		System.out.println(connection);
		statement = connection.createStatement();
	}
	static void creatingTable() throws SQLException {
		String query = "create table movies(id int,name varchar(100),runtime int)";
		statement.execute(query);
		System.out.println("Table is created");
	}
	static void deleteTable() throws SQLException {
		String query = "drop table movies";
		statement.execute(query);
		System.out.println("Table is deleted");
	}
}