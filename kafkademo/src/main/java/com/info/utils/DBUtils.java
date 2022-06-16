package com.info.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtils {

	private static Connection connection;
	
	public static Connection getMySQLDatabaseConnection() {

		String driverName = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/kafkadb";
		String username = "root";
		String password = "root";

		try {
			// loading the driver
			Class.forName(driverName);

			// getting connection object
			connection = DriverManager.getConnection(url, username, password);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return connection;

	}

}
