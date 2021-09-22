package com.revature.bankapp.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.app.dao.impl.AccountDaoImpl;
import com.revature.bankapp.model.CreateAccout;
import com.revature.bankapp.model.ViewAccountsAndTransactions;

public class TransactionMenu extends Menu{
	public static String transferAccNum;
	public static String accNumber;
	Scanner sc = new Scanner(System.in);
	//CustomerMenu cusMenu = new CustomerMenu("Customer Menu");

		public TransactionMenu(String name) {
			super(name);
			addMenuItem("WITHDRAWL");
			addMenuItem("DEPOIST");
			addMenuItem("VIEW TRANSACTIONS");
			addMenuItem(" BALANCE");

			addMenuItem("GO TO MAINMENU");

		}
		

		public String getAccount() {
			System.out.println("Enter Account number to make transaction: ");
			accNumber = sc.nextLine();
			System.out.println("Account Number: " + accNumber);
			return accNumber;
		}

		void handleAction() {
			AccountDaoImpl accdao = new AccountDaoImpl();
			switch (selection) {

			case 1:
				try {
					System.out.println("Enter amount to withdraw: ");
					double amount = sc.nextDouble();
					accdao.currentAccount();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				displayMenuAndCaptureSelection1();
				break;
			case 2:
				
				try {
					System.out.println("Enter amount to deposit: ");
					double amount = sc.nextDouble();
					accdao.currentAccount().deposit(amount);
				} catch (SQLException e) {
					e.printStackTrace();
				}
				displayMenuAndCaptureSelection1();
				break;
				
			case 3:
				try {
					accdao.currentAccount();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				ViewAccountsAndTransactions.transactionsList();
				displayMenuAndCaptureSelection1();
				break;
				
			case 4:
				try {
					CreateAccout balance = accdao.currentAccount();
					System.out.println("Balance: " + balance);
				} catch (SQLException e1) {
					e1.printStackTrace();
				}				
				displayMenuAndCaptureSelection1();
				break;
			
			
				
			case 5:
				MainMenu menu = new MainMenu("Main Menu");
				menu.displayMenuAndCaptureSelection();
			}
			
		}

			
		}

	



			


