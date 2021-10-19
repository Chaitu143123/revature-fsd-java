package com.revature.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.revature.bankapp.dao.EmployeeDao;
import com.revature.bankapp.dao.Util;
import com.revature.bankapp.exception.AppException;
import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.Employee;
import com.revature.bankapp.model.Transaction;

public class EmployeeDaoImpl implements EmployeeDao {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(EmployeeDaoImpl.class);

	@Override
	public void create(Employee employee) throws AppException {
		LOGGER.info("Start");
		LOGGER.debug("{}",employee);
		try(Connection connection = Util.getConnection()) {
			String sql = "insert into employee (firstName, lastName, email, password) values (?, ?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, employee.getFirstName());
			statement.setString(2, employee.getLastName());
			statement.setString(3, employee.getEmail());
			statement.setString(4, employee.getPassword());
			statement.executeUpdate();	
			LOGGER.info("End");
		} catch(SQLException e) {
			LOGGER.error("Error inserting employee", e);
			throw new AppException(e);
		}
		
	}

	@Override
	public Employee getEmployeeByEmail(String email) throws AppException {
		LOGGER.info("Login Start");
		try(Connection connection = Util.getConnection()) {
			String sql = "SELECT * FROM newbankapp.employee where email = ?";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setString(1, email);
			ResultSet resultSet = statement.executeQuery();	
			while (resultSet.next()) {
				Employee employee = new Employee();
				employee.setFirstName(resultSet.getString("firstName"));
				employee.setLastName(resultSet.getString("lastName"));
				employee.setEmail(resultSet.getString("email"));
				employee.setPassword(resultSet.getString("password"));
				return employee;
			}
		} catch(SQLException e) {
			LOGGER.error("Error getting customer", e);
			throw new AppException(e);
		}
		return null;
	}
	@Override
	public List<Customer> viewCustomer() throws AppException {
		List<Customer> customerList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select id,firstname,lastname,email from customer";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while(resultSet.next()) {
				Customer customerTemp = new Customer();
				customerTemp.setId(resultSet.getInt("id"));
				customerTemp.setFirstname(resultSet.getString("firstname"));
				customerTemp.setLastname(resultSet.getString("lastname"));
				customerTemp.setEmail(resultSet.getString("email"));
//				Account account = new Account();
//				 account.setAccountNumber(resultSet.getString("accountNumber"));
//				 account.setBalance(resultSet.getDouble("balance"));
//				 customerTemp.setAccountList(account);
//				 
				 
//				 System.out.println("customer"+customerTemp);
				 
				 
				
				
				customerList.add(customerTemp);
			}
		}catch (SQLException e) {
				throw new AppException(e);
		}
			
		return customerList;
		}
		
	

	@Override
	public List<Account> showAccount() throws AppException {
		List<Account> accountList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select c.id, c.firstname, accountNumber, balance from account\r\n" + 
					"inner join customer c on customerId = c.id";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Account accountTemp = new Account();
				accountTemp.setId(resultSet.getInt("id"));
				
				accountTemp.setAccountNumber(resultSet.getString("accountNumber"));
				accountTemp.setBalance(resultSet.getDouble("balance"));
				accountList.add(accountTemp);

			}
		}
		catch (SQLException e) {
			throw new AppException(e);
	}
		return accountList;
	}

	public List<Transaction> viewTransaction() throws AppException {
		List<Transaction> transactionList = new ArrayList<>();
		try (Connection connection = Util.getConnection()) {
			String sql = "select c.id, a.accountNumber, a.balance, t.type, t.amount from transaction t\r\n" + 
					"inner join account a on account_id = a.id\r\n" + 
					"inner join customer c on cus_id = c.id";
			PreparedStatement statement = connection.prepareStatement(sql);
			ResultSet resultSet = statement.executeQuery();
			while (resultSet.next()) {
				Transaction transactionTemp = new Transaction();
				transactionTemp.setCustomerId(resultSet.getInt("id"));
				//transactionTemp.setFirstName(resultSet.getString("firstname"));
				//transactionTemp.setLtName(resultSet.getString("firstname"));
				transactionTemp.setAccountNumber(resultSet.getString("account_num"));
				transactionTemp.setBalance(resultSet.getDouble("balance"));
				transactionTemp.setType(resultSet.getString("type").charAt(0));
				transactionTemp.setAmount(resultSet.getDouble("amount"));
				transactionTemp.setAccount_id(resultSet.getInt("id"));
				transactionList.add(transactionTemp);

			}
		}
		catch (SQLException e) {
			throw new AppException(e);
	}
		return transactionList;
	}

	
	}
	

