package jdbc.Connection.ex8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class launchJava {
	public static void main(String[] args) throws SQLException {
		Connection connection = null;
		Statement statement = null;
		// ResultSet result= null;
		String url = "jdbc:mysql://localhost:3306/testapp";
		String user = "root";
		String password = "Password";

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Your ID");
		int cid = scan.nextInt();
		System.out.println("Enter Your Name");
		String cname = scan.next();
		System.out.println("Ente Mentor Name ");
		String mentor = scan.next();
		System.out.println("Duration to Complete the course");
		int duration = scan.nextInt();
		try {
			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) {
				statement = connection.createStatement();
				if (statement != null) {

					String sqlInsertQuery = "insert into course values(cid,'cname','mentor',duration)";
					int rowsUpdate = statement.executeUpdate(sqlInsertQuery);
					System.out.println("Update the data in sql table " + rowsUpdate);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (statement != null) {
			statement.close();
		}
		if (connection != null) {
			connection.close();
		}
		if (scan != null) {
			scan.close();
		}
	}
}
