package jdbc.Connection.ex8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;
import java.util.Scanner;

import com.mysql.*;

import JdbcUtil.JdbcConnection;   



public class TestappJDBC {
public static void main(String[] args) throws SQLException {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter The Course Name ::");
	String c_name= scan.next();
	System.out.println("Enter Mentor name ::");
	String mentor=scan.next();
	System.out.println("Course Complete Duration ::");
	
	int duration=scan.nextInt();
	
	Connection connection=null;
	PreparedStatement prestatement=null;
	
	try {
	connection= JdbcConnection.getJdbcConnection();
	if(connection!=null) {
		String sqlInsertQuery="insert into course(c_name,mentor_name,duration)values(?,?,?)";
		prestatement = connection.prepareStatement(sqlInsertQuery);
		if(prestatement!=null) {
			
			prestatement.setString(1, c_name);
			prestatement.setString(2, mentor);
			prestatement.setInt(3, duration);
			int rowAffected= prestatement.executeUpdate();
			System.out.println("No, of rows Affected is :: "+ rowAffected);
		}
		
	}
	}catch (SQLException e) {
		e.printStackTrace();
	}catch (Exception e) {
		e.printStackTrace();
	}finally {
		JdbcConnection.closeConnection(null, prestatement, connection);
	if(	scan != null) {
		scan.close();
	}
	}
	}
}
