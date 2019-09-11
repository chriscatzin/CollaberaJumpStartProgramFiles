package JDBCExample;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {

	static final String URL = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
	static final String USERNAME = "root";
	static final String PASSWORD = "Ccatniz1996/"; // TODO: change password to yours if different
	
	public static Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			System.out.println("Connected to database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return conn;
	}
	
	public static void main(String[] args) {
		Connection conn = ConnectionManager.getConnection();
		try {
			conn.close();
			System.out.println("Closed connection to database");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}