package com.info.utils;

import java.sql.Connection;
import java.sql.DriverManager;

public class DUtils {
	
	public static Connection connection;
	
	public static Connection getConnection() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/kafkadb";
		String username = "root";
		String password = "root";
		
		try {
			Class.forName(driver);
			
			connection=DriverManager.getConnection(url, username, password);
			
		}catch (Exception e) {
			e.printStackTrace();	
		}
		
		return connection;
	}

}
