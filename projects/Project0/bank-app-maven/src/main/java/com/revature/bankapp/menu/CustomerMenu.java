package com.revature.bankapp.menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.app.dao.impl.AccountDaoImpl;
import com.revature.bankapp.model.CreateAccout;
import com.revature.bankapp.model.Model;

import om.revature.app.dao.AccountDao;
import om.revature.app.dao.Util;

public class CustomerMenu extends Menu
{
   public CustomerMenu(String name) {
		super(name);
		addMenuItem("CREATE ACCOUNT");
		addMenuItem("VIEW ACCOUNT");
		addMenuItem("EXIT");
		displayMenuAndCaptureSelection();


}
	@Override
	void handleAction() {
		
		Scanner scanner = new Scanner(System.in);

		switch(selection) {
		case 1:
			System.out.println("===================");
			System.out.println("Create a new account");
			System.out.println("====================");

			
			System.out.print("Enter Account Number : ");
			String accountNumber = scanner.nextLine();
			System.out.print("Enter starting balance : ");
			double balance = scanner.nextLong();
			AccountDaoImpl accountDaoImpl = new AccountDaoImpl();
			try {
				accountDaoImpl.create(new CreateAccout(accountNumber,balance));
			} catch (SQLException e) {
				e.printStackTrace();
			}
			System.out.print("created account successfully ");
            displayMenuAndCaptureSelection();


            break;
		case 2:
			System.out.println("These are Your Accounts");
			AccountDaoImpl accdao = new AccountDaoImpl();
			try {
				ArrayList<CreateAccout>account_list=(ArrayList<CreateAccout>) accdao.showAccounts();
				account_list.forEach(System.out::println);
				}
				
			 catch (SQLException e) {
				e.printStackTrace();
			}
			TransactionMenu transactionMenu = new TransactionMenu("Transaction Menu");
			transactionMenu.getAccount();
			transactionMenu.displayMenuAndCaptureSelection1();
						

	
			break;
		case 3:
			System.out.println("exit");
			break;

	
            	
		}
	}
}

			
		
			

		
	

	
	

		
	

	
		
	

	
	




	
	

	


