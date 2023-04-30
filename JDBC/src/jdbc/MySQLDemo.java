package jdbc;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLDemo {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// step1: load the jdbc driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// step2: provide connection by giving url,username and password
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ottplatform","root","Lokesh@123");
		System.out.println(connection);
		// step3:create statement object to send sql queries
		Statement statement = connection.createStatement();
		// use statement object to execute queries
		//statement.execute("insert into users values(4,'digitallync','digital123')");
		statement.execute("insert into users values(2,'raja','raja123')");
		statement.execute("delete from users where userId=4");
		
		statement.close();
		connection.close();
	}
}
