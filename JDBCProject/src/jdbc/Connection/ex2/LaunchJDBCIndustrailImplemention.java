package jdbc.Connection.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.mysql.cj.jdbc.Driver;
import com.mysql.*;

public class LaunchJDBCIndustrailImplemention {
	public static void main(String[] args) throws Exception  {
	

		Scanner scanner= new Scanner(System.in);
		System.out.println();
		try {
		connection =DriverManager.getConnection(url,user,password);
		System.out.println("Connection is sucessful..."+ connection);
		if(connection!=null) {
			statement=connection.createStatement();
			System.out.println("Satement Object is created..."+ statement);
			if(statement!=null) {
				System.out.println("Cid\tCname\tMentor\tDuration");
				String InsertSqlQuery="select * from course";
				 resultset =statement.executeQuery(InsertSqlQuery);
				if(resultset.next()) {
				 Integer c_id=resultset.getInt(1);
				 String c_name= resultset.getString(2);
				 String mentor=resultset.getString(3);
				 Integer duration=resultset.getInt(4);
				 System.out.println(c_id+"\t"+c_name+"\t"+mentor+"]t"+duration); 
				}
				
			}
		}
		
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		resultset.close();
		statement.close();
		connection.close();
		
	}
}
