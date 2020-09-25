package com.hsbc.controller;

import java.sql.SQLException;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

import org.apache.derby.jdbc.ClientDriver;

public class RowSet {
	public static void main(String args[]) {
		
		try {
			Class.forName(ClientDriver.class.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	try {
	      JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
	      rowSet.setUrl("jdbc:derby://localhost:1527/mydb");  
	      rowSet.setUsername("ronak");  
	      rowSet.setPassword("ronak1702"); 
	      rowSet.setCommand("select * from address"); 
	      rowSet.execute();
	  
	      
	      while (rowSet.next()) {  
              // Generating cursor Moved event  
              System.out.println("State: " + rowSet.getString(1));  
              System.out.println("City: " + rowSet.getString(2));  
              System.out.println("Id_ref: " + rowSet.getInt(3));  
      }  
        } 
	catch (SQLException e2)
	{
	// TODO Auto-generated catch block
	  e2.printStackTrace();    
    }
	
	
	 
               
   
      
	
	
	}
}

