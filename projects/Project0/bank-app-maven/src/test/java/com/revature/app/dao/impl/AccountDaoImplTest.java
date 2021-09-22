package com.revature.app.dao.impl;


import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;
import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.revature.bankapp.model.CreateAccout;

class AccountDaoImplTest {

	@Test
	void test() {
		AccountDaoImpl adao = new AccountDaoImpl();
		CreateAccout account = new CreateAccout(null,(double) 0);
		account.setAccountNumber("11110");

		account.setBalance(6000);
		try {
			adao.create(account);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public void test_Success() {
			AccountDaoImpl adao = new AccountDaoImpl();
			try {
				adao.showAccounts();
			} catch (SQLException e) {
				e.printStackTrace();
				fail("failed getting account Details");
		}
	}
}

	



