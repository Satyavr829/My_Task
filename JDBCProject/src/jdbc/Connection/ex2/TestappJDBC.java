package jdbc.Connection.ex2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class TestappJDBC {
public static void main(String[] args) throws SQLException {
	//load and register driver
	Driver driver=new Driver();
	DriverManager.registerDriver(driver);
	//Establish the connection 
	String url="jdbc:mysql://localhost:3306/testapp";
	String user="root";
	String password="Password";
	Connection connection=	DriverManager.getConnection(url,user,password);
	Statement statment= connection.createStatement();
	 String sqlInsertQuery="select * from student";
	 ResultSet result =statment.executeQuery(sqlInsertQuery);
	 System.out.println("SID\tSNAME\tCourseID\tAssignment");
	 while(result.next()) {
	 Integer s_id =result.getInt(1);
	 String s_name= result.getString(2);
	 Integer c_id =result.getInt(3);
	 Integer assign =result.getInt(4);
	 System.out.println(s_id+"\t"+s_name+"\t"+c_id+"\t"+assign);
	 }
	 result.close();
	 statment.close();
	 connection.close();
}
}
