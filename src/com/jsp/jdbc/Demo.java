package com.jsp.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
 public static void main(String args[]) throws SQLException {
	 
	 String url="jdbc:mysql://localhost:3306/javabatch";
	 String username="root";
	 String password="root";
	 
	 Connection connection = null;
	 //1.register the driver
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection(url, username, password);
		  Statement statement = connection.createStatement();
		  statement.execute("INSERT INTO car VALUES (100,'scorpio','X5')");
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 finally {
		 connection.close();
		 System.out.println("All Good");
	 } 
 }
}
