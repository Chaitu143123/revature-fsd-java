package com.revature.bankapp.model;

import java.util.List;
import java.sql.SQLException;
import java.util.ArrayList;

import com.revature.app.dao.impl.AccountDaoImpl;
import com.revature.bankapp.menu.CustomerMenu;
import com.revature.bankapp.menu.TransactionMenu;

public class ViewAccountsAndTransactions {
	

		public static ArrayList<CreateAccout> accountsList() {

			AccountDaoImpl accdao = new AccountDaoImpl();
			try {
				List<CreateAccout> accounts = accdao.accountList();
				for (int i = 0; i < accounts.size(); i++) {
					System.out.println((i + 1) + ") " + accounts.get(i));
				}
				CustomerMenu cm = new CustomerMenu("Customer Menu");
				cm.displayMenuAndCaptureSelection();;
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Cannot display accounts");
			}
			return null;
		}

		public static ArrayList<Transacation> transactionsList() {

			AccountDaoImpl accdao = new AccountDaoImpl();
			try {
				List<Transacation> transaction = accdao.transactionList();
				for (int i = 0; i < transaction.size(); i++) {
					System.out.println((i + 1) + ") " + transaction.get(i).print());
				}
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("Cannot display accounts");
			}
			return null;
		}
	}
