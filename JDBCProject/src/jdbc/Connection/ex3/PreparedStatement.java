package jdbc.Connection.ex3;
import java.sql.*;
//import com.sql.mysql.cj.jdbc;
public class PreparedStatement {


public static void main(String[] args) throws Exception {
	Connection connection= null;
	PreparedStatement prestatement=null;
	ResultSet resultset=null;
	
	String url="jdbc:mysql://localhost:3306/testapp";
	String user="root";
	String password="Password";
	public PreparedStatement preparedstatement(String sql) {
	try {
	connection =DriverManager.getConnection(url,user,password);
	if(connection!=null) {
		String insertSqlQuery="select * from course where c_id=?";
		prestatement=(PreparedStatement) connection.prepareStatement(insertSqlQuery);
	}
	}catch (SQLException e) {
		e.printStackTrace();
	}
	return connection;
	}
	
}
}
