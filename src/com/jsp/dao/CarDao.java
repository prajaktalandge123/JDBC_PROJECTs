package com.jsp.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.helper.HelperClass;

public class CarDao {

	
	HelperClass helperClass=new HelperClass();
	
	public void saveCar() {
	Connection connection=helperClass.getConnection();
	
	String sql="INSERT INTO car VALUES (7,'BMW','X5')";
	
	try {
		Statement statement= connection.createStatement();
		statement.execute(sql);
		connection.close();
		System.out.println("All Good");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	
	public int updateCar() {
		Connection connection =helperClass.getConnection();
		
		String sql="UPDATE car SET name='mercedes' WHERE id=7";
		int n=0;
		Statement statement;
		try {
			statement = connection.createStatement();
			n=statement.executeUpdate(sql);
			connection.close();
			System.out.println("All Good");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return n;
		
	}
	
	public boolean deleteCar() {
		
		Connection connection =helperClass.getConnection();
		String sql="DELETE FROM car WHERE id=7";
		int a=0;
		try {
			Statement statement=connection.createStatement();
			a=statement.executeUpdate(sql);
			connection.close();
			System.out.println("All Good");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(a>0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void getAllcars() {
		Connection connection =helperClass.getConnection();
		String sql="SELECT * FROM car";
		
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(sql);
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("========================");
			}
			
			connection.close();
			
			System.out.println("All Good");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void getByid() {
		Connection connection =helperClass.getConnection();
		String sql="SELECT * FROM car WHERE id=7";
		
		try {
			Statement statement=connection.createStatement();
			ResultSet resultSet=statement.executeQuery(sql);
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
			}
			
			connection.close();
			System.out.println("All Good");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
