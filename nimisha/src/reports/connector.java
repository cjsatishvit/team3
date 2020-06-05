package reports;

import java.sql.Connection;
import java.sql.DriverManager;

//establishing connection to database

public class connector implements databaseConn{
	static Connection conn = null;
	public static Connection getConn() {
		try {
			Class.forName("con.mysql.jdbc.Driver");
			conn = DriverManager.getConnection(url, username, pass);
		}catch(Exception e) {
			System.out.println(e);
		}
		return conn;
	}
}
