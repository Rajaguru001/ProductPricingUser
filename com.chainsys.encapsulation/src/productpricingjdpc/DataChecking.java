package productpricingjdpc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataChecking {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/productinfo", "root",
				"Guru@7733");
		return connection;
	}

}
