package com.revature.bankapp.menu;

import java.util.Scanner;

import com.revature.bankapp.form.LoginForm;
import com.revature.bankapp.model.DataManager;
import com.revature.bankapp.model.Model;

public class MainMenu extends Menu {

	public MainMenu(String name) {
		super(name);

		addMenuItems("REGISTER NEW CUSTOMER");
		addMenuItems("LOGIN AS CUSTOMER");
		addMenuItems("LOGIN AS EMPLOYEE");
		addMenuItems("EXIT");
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
	        DataManager.addCustomer(new Model(firstname,lastname,email,password));
	        System.out.println("customer added successfully");
		case 2:
			LoginForm loginform=new LoginForm("Login Form");
			loginform.captureDataAndPerformAction();
			break;
	        	

	        }

		

		
	}
}



