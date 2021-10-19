package com.revature.bankapp.dao;

import java.sql.SQLException;
import java.util.List;

import com.revature.bankapp.exception.AppException;
import com.revature.bankapp.model.Account;
import com.revature.bankapp.model.Customer;
import com.revature.bankapp.model.Employee;
import com.revature.bankapp.model.Transaction;

public interface EmployeeDao {
	void create(Employee employee) throws AppException;	
	Employee getEmployeeByEmail(String email) throws AppException;
   List<Customer> viewCustomer() throws AppException;
	
	List<Transaction> viewTransaction() throws AppException;

	List<Account> showAccount() throws AppException; 

}