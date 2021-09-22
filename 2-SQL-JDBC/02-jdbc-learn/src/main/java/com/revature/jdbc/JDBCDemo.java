package com.revature.jdbc;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

import java.sql.Connection;


public class JDBCDemo {


	private static Statement connection;

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/learndb",
					"root",
					"Chaitu@123");
			System.out.println(connection.getClass().getName());
			System.out.println("connection successfull");
			String sql ="insert into department (name) values ('innovation')";
			Statement statement=connection.createStatement();
		    statement.executeUpdate("insert into department (name) values ('innovation')");
			connection.close();

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		}

	}


