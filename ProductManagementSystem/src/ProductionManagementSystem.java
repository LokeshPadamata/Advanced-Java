package ProductionManagementSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class ProductionManagementSystem {
	static Connection connection = null;
	static Statement statement = null;
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		ProductionManagementSystem.getDataBaseConnection();
		ProductionManagementSystem.CreateTable();
		addProduct(101,"'watch'",2000);
		addProduct(102,"'Mobile'",20000);
		addProduct(103,"'Laptop'",50000);
		updateProduct(102,"SmartPhone");
		closeConnection();
	 }
	 static void getDataBaseConnection() throws ClassNotFoundException, SQLException {
		// load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		// get connection
		ProductionManagementSystem.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/ProductManagementSystem","root","Lokesh@123");
		System.out.println(connection);
		statement = connection.createStatement();		
	 }
	 static void CreateTable() throws SQLException {
		String query = "create table Products(productId int,productName varchar(50),productPrice int)";
		System.out.println(query);
		statement.execute(query);
		System.out.println("Table Created");
	}
	static void addProduct(int id,String name,int price) throws SQLException {
		String query = "insert into products values("+id+","+name+","+price+")";
		System.out.println(query);
		statement.execute(query);
		System.out.println("inserted");
	 }
	
	 static void deleteProduct(int id) throws SQLException {
		String query = "delete from Products where id="+id;
		statement.execute(query);
		System.out.println("Product deleted");
	 }
	 static void updateProduct(int id,String name) throws SQLException {
		if(name!=null) {
			String query = "update users set password='"+name+"' where userid="+id;
			statement.execute(query);
			System.out.println("Updated");
		}
	  }	
		static void getAllProducts() throws SQLException{
			ResultSet rs = statement.executeQuery("Select * from Products");
			System.out.println("productId   \t ProductName     \t  ProductPrice");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"     \t" +rs.getString(2)+" \t     "+rs.getString(3));
			}		
		}	
		static void closeConnection() throws SQLException {
			connection.close();
		}

	}
