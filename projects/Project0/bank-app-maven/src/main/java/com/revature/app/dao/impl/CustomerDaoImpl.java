package com.revature.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.bankapp.model.Model;

import om.revature.app.dao.CustomerDao;
import om.revature.app.dao.Util;

public class CustomerDaoImpl implements CustomerDao {

	public static int current_id;

	@Override
	public void create(Model model) throws SQLException {
		try(Connection connection=Util.getConnection()){
			String sql="insert into customer(FirstName,LastName,email,password)values(?,?,?,?)";
			PreparedStatement statement=connection.prepareStatement(sql);
			statement.setString(1,model.getFirstname());
			statement.setString(2,model.getLastname());
			statement.setString(3,model.getEmail());
			statement.setString(4,model.getPassword());
			statement.executeUpdate();
			}

	}

	@Override
	public Model getCustomerByEmail(String email) {
		try(Connection connection=Util.getConnection()){
	    String sql="select * from newbankapp.customer where email=?";
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setString(1,email);
		ResultSet resultSet=statement.executeQuery();
		if(resultSet.next()) {
			Model model=new Model();
			model.setId(resultSet.getInt("id"));
			model.setFirstname(resultSet.getString("firstname"));
			model.setLastname(resultSet.getString("lastname"));
			model.setEmail(resultSet.getString("email"));
			model.setPassword(resultSet.getString("password"));
			return model;

			
		}



		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

		
		return null;
	}

}
