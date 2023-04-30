package jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.jdbc.DatabaseMetaData;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class MetaDataJDBC {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ottplatform","root","Lokesh@123");
			//DatabaseMetaData
			DatabaseMetaData dbmetadata = (DatabaseMetaData) connection.getMetaData();
			System.out.println(dbmetadata.getDatabaseProductName());
			System.out.println(dbmetadata.getDatabaseProductVersion());
			//Result Metadata
			Statement statement = connection.createStatement();
			ResultSet resultset =statement.executeQuery("select * from movies");
			ResultSetMetaData rsm = (ResultSetMetaData) resultset.getMetaData();
			System.out.println("No.of columns: " + rsm.getColumnCount());
			System.out.println("colum label: " + rsm.getColumnLabel(2));
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
