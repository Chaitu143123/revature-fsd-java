package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.bankapp.dao.CustomerDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.exception.AppException;
import com.revature.bankapp.model.Customer;

public class CustomerDaoImpl implements CustomerDao {
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerDaoImpl.class);


	@Override
	public int create(Customer customer) throws AppException {
		LOGGER.info("start");
		LOGGER.debug("{}",customer);
		try(Connection connection=Util.getConnection()){
			String sql="insert into newbankapp.customer(FirstName,LastName,email,password)values(?,?,?,?)";
			PreparedStatement statement=connection.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			statement.setString(1,customer.getFirstName());
			statement.setString(2,customer.getLastName());
			statement.setString(3,customer.getEmail());
			statement.setString(4,customer.getPassword());
			statement.executeUpdate();
			LOGGER.debug("query successful");
			ResultSet rs=statement.getGeneratedKeys();
			if(rs.next()) {
				return rs.getInt(1);
			}
			LOGGER.info("end");
			return 0;
			}catch(SQLException e) {
				LOGGER.error("error ",e);
				throw new AppException(e);
			}

	}
	@Override
	public Customer getCustomerByEmail(String email) throws AppException {
		LOGGER.info("Login Start");
		try(Connection connection = Util.getConnection()) {
			String sql = "SELECT * FROM newbankapp.customer where email = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, email);
			ResultSet resultSet = statement.executeQuery();	
			while (resultSet.next()) {
				Customer customer = new Customer();
				customer.setId(resultSet.getInt("id"));
				customer.setFirstname(resultSet.getString("firstName"));
				customer.setLastname(resultSet.getString("lastName"));
				customer.setEmail(resultSet.getString("email"));
				customer.setPassword(resultSet.getString("password"));
				return customer;
			}
		} catch(SQLException e) {
			LOGGER.error("Error getting customer", e);
			throw new AppException(e);
		}
		return null;
	}



		}
	

	


