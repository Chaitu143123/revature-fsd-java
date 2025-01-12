package com.revature.app.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.revature.bankapp.main.BankApp;
import com.revature.bankapp.menu.TransactionMenu;
import com.revature.bankapp.model.CreateAccout;
import com.revature.bankapp.model.Model;
import com.revature.bankapp.model.Transacation;

import om.revature.app.dao.AccountDao;
import om.revature.app.dao.Util;

public class AccountDaoImpl implements AccountDao {
	public static int currentAccountId;
	public static int transferAccountId;
	



	@Override
	public
	void create(CreateAccout model) throws SQLException{
		try (Connection connection = Util.getConnection()) {
			String sql = "INSERT INTO account (accountNumber, balance,cust_id) VALUES (?,?,?)";
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			preparedStatement.setString(1, model.getAccountNumber());
			preparedStatement.setInt(2, (int) model.getBalance());
			preparedStatement.setInt(3, CustomerDaoImpl.current_id);

			preparedStatement.executeUpdate();

		}

		
		}

	@Override
	public List<CreateAccout> showAccounts() throws SQLException {
			List<CreateAccout> accountList = new ArrayList<>();
			try (Connection connection = Util.getConnection()) {
				String sql = "select * from account where cust_id=?";
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, CustomerDaoImpl.current_id);
				ResultSet rs = preparedStatement.executeQuery();

				while (rs.next()) {
					CreateAccout account = new CreateAccout();
					account.setAccountNumber(rs.getString("accountNumber"));
					account.setBalance(rs.getDouble("balance"));

					accountList.add(account);
				}
			}
			return accountList;

	}

	public CreateAccout currentAccount() throws SQLException {
		CreateAccout account = null;
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from account where accountNumber = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, TransactionMenu.accNumber);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int currentAccountId = resultSet.getInt("id");
				String accountNumber = resultSet.getString("accountNumber");
				Double balance= resultSet.getDouble("balance");

				account = new CreateAccout(accountNumber, balance);
			}
		}
		return account;
	}

	public void insert(Transacation transaction) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "insert into transaction (type, amount, account_id) values (?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, String.valueOf(transaction.getType()));
			statement.setDouble(2, transaction.getAmount());
			statement.setInt(3, currentAccountId);
			statement.executeUpdate();

		}

	}

	public void insertTransfer(Transacation transaction) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "insert into transaction (type, amount, account_id) values (?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, String.valueOf(transaction.getType()));
			statement.setDouble(2, transaction.getAmount());
			statement.setInt(3, transferAccountId);
			statement.executeUpdate();
		}
	}

	public void update(CreateAccout account) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "update account set balance = ? where id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setDouble(1, account.getBalance());
			statement.setInt(2, currentAccountId);
			statement.executeUpdate();
		}
	}

	public List<Transacation> transactionList() throws SQLException {
		List<Transacation> transactionList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from transaction where account_id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, currentAccountId);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Transacation transaction = new Transacation();
				transaction.setType(resultSet.getString("type").charAt(0));
				transaction.setAmount(resultSet.getDouble("amount"));
				transactionList.add(transaction);

			}
		}

		return transactionList;

	}

	public void updateTransfer(CreateAccout account) throws SQLException {
		try (Connection connection = Util.getConnection()) {
			String sql = "update account set balance = ? where id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setDouble(1, account.getBalance());
			statement.setInt(2, transferAccountId);
			statement.executeUpdate();
		}
	}

	public CreateAccout transferAccount() throws SQLException {
		CreateAccout account = null;
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from account where accountNumber = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, TransactionMenu.transferAccNum);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				int transferAccountId = resultSet.getInt("id");
				String accountNumber = resultSet.getString("accountNumber");
				Double balance = resultSet.getDouble("balance");

				account = new CreateAccout(accountNumber, balance);
				
			}
			
		}
		return account;
	}
	
	public List<CreateAccout> accountList() throws SQLException {
		List<CreateAccout> accountList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select * from account where cust_id = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, CustomerDaoImpl.current_id);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				CreateAccout account = new CreateAccout();
				account.setAccountNumber(resultSet.getString("accountNumber"));
				account.setBalance(resultSet.getDouble("balance"));
				accountList.add(account);

			}
		}

		return accountList;

	}
	
}
		
	
			

				

		
		
	

	
	

	
	



	

	



