package filehandling.java.ex1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class testjdbcApp {

	public static void main(String[] args) throws SQLException {
	
		String url="";
		String user="";
		String password="";
	Connection connection=	DriverManager.getConnection(url,user,password);

	}

}
