package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class CRUDoperations {
	static Connection connection = null;
	static Statement statement = null;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		getDataBaseConnection();
		System.out.println("connection: " + connection);
		//insertUser(7,"raju","raju123");
		//deleteUser(5);
		//updateUsers(1,null,"1234");
		getAllUsers();
	}
	static void getDataBaseConnection() throws ClassNotFoundException, SQLException {
		// load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// get connection
		CRUDoperations.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ottplatform","root","Lokesh@123");
		System.out.println(connection);
		statement = connection.createStatement();
	}
	static void insertUser(int id,String name,String password) throws SQLException {
		String query = "insert into users values("+id+",'"+name+"','"+password+"')";
		statement.execute(query);
		System.out.println("insertion done");
	}
	static void deleteUser(int id) throws SQLException {
		String query = "delete from users where userid="+id;
		statement.execute(query);
		System.out.println("deletion done");
		
	}
	static void updateUsers(int id,String name,String password) throws SQLException {
		if(name==null && password!=null ) {
			String query = "update users set password='"+password+"' where userid="+id;
			statement.execute(query);
		}
		if(name!=null && password==null ) {
			String query = "update users set name='"+name+"' where userid="+id;
			statement.execute(query);
		}
		System.out.println("updation done");
	}
	static void getAllUsers() throws SQLException{
			ResultSet rs = statement.executeQuery("Select * from users");
			System.out.println("usrId   \t name     \t  password");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"     \t" +rs.getString(2)+" \t     "+rs.getString(3));
			}
			
	}
	static void closeConnection() throws SQLException {
		connection.close();
	}
	
}
