package jdbc.Connection.ex4;

import java.sql.*;

public class LaunchJDBC {
    
	public Connection getJDBCConnection() {
	Connection connection= null;
	Statement statement=null;
	String url="";
	String user="";
	String password="";
	try {
	connection=DriverManager.getConnection(url,user,password);
	}catch (SQLException e) {
		e.printStackTrace();
	}catch (Exception e) {
		e.printStackTrace();
	}
	}
	}
