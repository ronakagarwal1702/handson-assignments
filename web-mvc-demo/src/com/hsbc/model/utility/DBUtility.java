package com.hsbc.model.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.derby.jdbc.ClientDriver;

public class DBUtility {
	
	
	public static Connection getConnection()
	{
		Connection con=null;
		try
		{
			Class.forName(ClientDriver.class.getName());
			con=DriverManager.getConnection("jdbc:derby://localhost:1527//mydb","ronak","ronak1702");
		} 
		catch (ClassNotFoundException |SQLException  e) {
			System.out.println(e.getMessage());
		}
		return con;
	}

}
