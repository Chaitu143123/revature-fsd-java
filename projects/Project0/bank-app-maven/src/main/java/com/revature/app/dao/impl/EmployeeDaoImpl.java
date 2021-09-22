package com.revature.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.model.CreateAccout;
import com.revature.bankapp.model.Model;
import com.revature.bankapp.model.Transacation;

import om.revature.app.dao.EmployeeDao;
import om.revature.app.dao.Util;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public List<Model> viewCustomer() throws SQLException {
		List<Model> customerList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from customer";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Model customerTemp = new Model();
				customerTemp.setId(resultSet.getInt("id"));
				customerTemp.setFirstname(resultSet.getString("firstname"));
				customerList.add(customerTemp);
			}
		return customerList;
	}
	}
	@Override
	public List<CreateAccout> viewAccount() throws SQLException {
		List<CreateAccout> accountList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select c.id, c.firstname, accountNumber, balance from account\r\n" + 
					"inner join customer c on cust_id = c.id";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				CreateAccout accountTemp = new CreateAccout();
				accountTemp.setId(resultSet.getInt("id"));
				accountTemp.setFirstName(resultSet.getString("firstname"));
				accountTemp.setAccountNumber(resultSet.getString("accountNumber"));
				accountTemp.setBalance(resultSet.getDouble("balance"));
				accountList.add(accountTemp);

			}
		}
		return accountList;
	}

	@Override
	public List<Transacation> viewTransaction() throws SQLException {
		List<Transacation> transactionList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select c.id, c.FirstName, a.accountNumber, a.balance, t.type, t.amount from transaction t\r\n" + 
					"inner join account a on account_id = a.id\r\n" + 
					"inner join customer c on cust_id = c.id";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Transacation transactionTemp = new Transacation();
				transactionTemp.setId(resultSet.getInt("id"));
				transactionTemp.setFirstName(resultSet.getString("firstname"));
				transactionTemp.setAccountNumber(resultSet.getString("accountNumber"));
				transactionTemp.setBalance(resultSet.getDouble("balance"));
				transactionTemp.setType(resultSet.getString("type").charAt(0));
				transactionTemp.setAmount(resultSet.getDouble("amount"));
				transactionList.add(transactionTemp);

			}
		}
		return transactionList;
	}

}
