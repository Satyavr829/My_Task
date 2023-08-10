package jdbc.Connection.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;
import java.sql.*;


// Step: 1 Load and register the driver 
// Step: 2 Establish the connection b/w java application and database
// Step: 3 Create a Statement Object
// Step: 4 Send and execute the query
// Step: 5 process the result from resultSet
// Step: 6 Close the Connection
public class LaunchJDBC {
private static final String InsertSqlQuery = null;

public static void main(String[] args) throws SQLException {
	//Load and register the Driver
	Driver driver = new Driver();
	DriverManager.registerDriver(driver);
	//Establish the connection b/w java application and database
	//JDBC URL Syntax: <mainprotocol>: <subprotocol>://<subname>
	String url="jdbc:mysql://localhost:3306/testapp";
	String user="root";
	String password="Password";
	Connection connection= DriverManager.getConnection(url,user,password);
	System.out.println("Connection is created "+ connection);
	//Create a Statement Object
	Statement statement=connection.createStatement();
	System.out.println("Statement Object is created "+ statement);
	//process the result from resultset
	System.out.println("C_id\tC_Name\t Mentor\t Duration");
	String updatesqlQuery ="select * from course";
	 ResultSet result=statement.executeQuery(updatesqlQuery);
	 while(result.next()) {
	   Integer c_id=result.getInt(1);
	   String  c_name= result.getString(2);
	   String  mentor = result.getString(3);
	   Integer duration= result.getInt(4);
	   System.out.println( c_id+"\t" + c_name +"\t" + mentor +"\t" + duration);
	 }
	 result.close();
	 statement.close();
	 connection.close();
	 System.out.println("Connection is closed...");
}
}
