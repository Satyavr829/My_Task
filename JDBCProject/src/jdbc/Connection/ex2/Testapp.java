package jdbc.Connection.ex2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Testapp {
public static void main(String[] args) throws SQLException {
	Connection connection=null;
	Statement statement=null;
	ResultSet result= null;
	String url="jdbc:mysql://localhost:3306/testapp";
	String user="root";
	String password="Password";
	
	connection= DriverManager.getConnection(url,user,password);
	if(connection!=null) {
		connection.createStatement();
		if(statement!=null) {
		String sqlInsertQuery="select * from student";
		result =	statement.executeQuery(sqlInsertQuery);
		while(result.next()) {
			 Integer s_id =result.getInt(1);
			 String s_name= result.getString(2);
			 Integer c_id =result.getInt(3);
			 Integer assign =result.getInt(4);
			 System.out.println(s_id+"\t"+s_name+"\t"+c_id+"\t"+assign);
		}
		}
		if(result!=null) {
			result.close();
		}
		if(statement!=null) {
			statement.close();
		}
		if(connection!=null) {
			connection.close();
		}
	}
	
}
}
