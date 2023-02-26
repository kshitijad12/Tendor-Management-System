package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseUtility {

public static Connection provideTenderConnection() {
		
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost/Tendoer_Management_System";
		
		try {
			conn = DriverManager.getConnection(url,"root","MySQL#12");  // (***********) -> your mysql command line password

		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return conn;
		
		
	}
}
