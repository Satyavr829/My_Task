package JdbcUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.Statement;

public class JdbcConnection {
  
	private JdbcConnection() {
		
	}
	
	public static  Connection getJdbcConnection () throws SQLException {
		//Establish Connection
		Connection connection=null;
		Statement statement=null;
		Resultset resultset= null;
		//creating the connection b/w java application and database 
		String url="jdbc:mysql://localhost:3306/testapp";
		String user="root";
		String password="Password";
		
		connection =DriverManager.getConnection(url,user,password);
		if(connection !=null) 
			return connection;
		return connection;
		
	}
	public static  void closeConnection(Resultset resultset,Statement statement, Connection connection) throws SQLException {
		if(resultset!=null) {
			
		}
		if(statement!=null) {
			
		}
		if(connection!=null) {
			connection.close();
		}
		
	}
}
