package com.revature.bankapp.menu;

import java.sql.SQLException;
import java.util.Scanner;

import com.revature.app.dao.impl.CustomerDaoImpl;
import com.revature.bankapp.form.LoginForm;
import com.revature.bankapp.model.Model;

import om.revature.app.dao.CustomerDao;

public class MainMenu extends Menu {

	public MainMenu(String name) {
		super(name);

		addMenuItem("REGISTER NEW CUSTOMER");
		addMenuItem("LOGIN AS CUSTOMER");
		addMenuItem("LOGIN AS EMPLOYEE");
		addMenuItem("LOGOUT");
	}

	@Override
	void handleAction() {
		Scanner scanner = new Scanner(System.in);
		switch(selection) {
		case 1:
			System.out.println("=========");
	        System.out.println("REGISTER CUSTOMER");
	        System.out.println("===========");

	        System.out.println("Enter first name :");
	        String firstname= scanner.nextLine();
	        System.out.println("Enter last name :");
	        String lastname= scanner.nextLine();
	        System.out.println("Enter email :");
	        String email= scanner.nextLine();
	        System.out.println("Enter  password :");
	        String password= scanner.nextLine();
	        //DataManager.addCustomer(new Model(firstname,lastname,email,password));
	        CustomerDao dao=new CustomerDaoImpl();
	        try {
	        	dao.create(new Model(firstname,lastname,email,password));
	        }catch (SQLException e) {
		        System.out.println(" create customer");

	        	
	        }
	        System.out.println("customer added successfully !!");
	        displayMenuAndCaptureSelection();
	        break;
		case 2:
		    LoginForm loginform=new LoginForm("Login Form");
			loginform.captureDataAndPerformAction();
			break;
		case 3:
			EmployeeMenu employee=new EmployeeMenu("employee form");
			employee.displayMenuAndCaptureSelection2();
			break;
		case 4:
	        System.out.println("SUCCESSFULLY LOGOUT!!");

			break;
	        	

	        }

		

		
	}
}



