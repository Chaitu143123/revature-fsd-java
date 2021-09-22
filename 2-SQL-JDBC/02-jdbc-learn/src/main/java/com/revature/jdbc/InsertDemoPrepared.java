package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertDemoPrepared {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/learndb",
					"root",
					"Chaitu@123");
			System.out.println(connection.getClass().getName());
			System.out.println("connection successfull");
			String sql ="insert into department (name) values (?)";
			PreparedStatement statement=connection.prepareStatement(sql);
			statement.setString(1,"research");
		    statement.executeUpdate();
		    statement.setString(1,"statistics");
		    statement.executeUpdate();

			connection.close();

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
				
			}
		

		}



