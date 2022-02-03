package com.rohit.bs.util;

import java.sql.*;

public class DbUtil {
	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String DATABASE_NAME = "book_shop";
	public static final String URL = "jdbc:mysql://localhost:3306/";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "";
	
	public static Connection getConnection() throws Exception
	{
		Class.forName(DRIVER_NAME);
		return DriverManager.getConnection(URL + DATABASE_NAME, USERNAME, PASSWORD);
	}


}
