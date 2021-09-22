package com.revature.bankapp.menu;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.app.dao.impl.AccountDaoImpl;
import com.revature.app.dao.impl.CustomerDaoImpl;
import com.revature.app.dao.impl.EmployeeDaoImpl;
import com.revature.bankapp.form.LoginForm;
import com.revature.bankapp.model.CreateAccout;
import com.revature.bankapp.model.Model;
import com.revature.bankapp.model.Transacation;
import com.revature.bankapp.model.ViewAccountsAndTransactions;

import om.revature.app.dao.CustomerDao;
import om.revature.app.dao.EmployeeDao;

public class EmployeeMenu extends Menu{
	public EmployeeMenu(String name) {
		super(name);

		addMenuItem("EMPLOYEE REGISTER AS CUSTOMER");
		addMenuItem("VIEW CUSTOMERS");
		addMenuItem("VIEW ACCOUNTS");
		addMenuItem("VIEW TRANSACTIONS");
	    addMenuItem("LOGOUT");
}

@Override
void handleAction() {
	EmployeeDao edao = new EmployeeDaoImpl();
	AccountDaoImpl accdao = new AccountDaoImpl();


	Scanner scanner=new Scanner(System.in);
	switch (selection) {
	case 1:
		System.out.println("=========");
        System.out.println("REGISTER EMPLOYEE AS CUSTOMER");
        System.out.println("===========");

        System.out.println("Enter first name :");
        String firstname= scanner.nextLine();
        System.out.println("Enter last name :");
        String lastname= scanner.nextLine();
        System.out.println("Enter email :");
        String email= scanner.nextLine();
        System.out.println("Enter  password :");
        String password= scanner.nextLine();
        CustomerDao dao=new CustomerDaoImpl();
        try {
        	dao.create(new Model(firstname,lastname,email,password));
        }catch (SQLException e) {
        	e.printStackTrace();

        	
        }
        System.out.println("customer added successfully !!");
        LoginForm loginform=new LoginForm("Login Form");
		loginform.captureDataAndPerformAction();
		
        displayMenuAndCaptureSelection2();
		break;
	case 2:
		try {
			List<Model> list = edao.viewCustomer();
			for(int i =0; i <list.size(); i++) {
				System.out.println((i+1) + ") " + list.get(i));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		displayMenuAndCaptureSelection2();

		break;
	case 3:
		System.out.println("view Accounts");
		AccountDaoImpl accdao1 = new AccountDaoImpl();
		try {
			ArrayList<CreateAccout>account_list=(ArrayList<CreateAccout>) accdao1.showAccounts();
			account_list.forEach(System.out::println);
			}
			
		 catch (SQLException e) {
			e.printStackTrace();
		}
		displayMenuAndCaptureSelection2();

		break;
	case 4:
		try {
			accdao.currentAccount();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ViewAccountsAndTransactions.transactionsList();
		displayMenuAndCaptureSelection2();

		break;
		
	case 5:
		MainMenu menu = new MainMenu("Main Menu");
		menu.displayMenuAndCaptureSelection();
		break;
	}
	
}




}

	


