package com.revature.bankapp.form;

import java.util.Scanner;

import com.revature.bankapp.menu.CustomerMenu;
import com.revature.bankapp.model.DataManager;
import com.revature.bankapp.model.Model;

public class LoginForm extends Form{
	private static Object success;
	private String email;
	private String password;
	public LoginForm(String name) {
		super(name, name, name, name, success,success,success,success);
		// TODO Auto-generated constructor stub
	}

	public void captureData() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter email :");
        email= scanner.nextLine();
        System.out.println("Enter  password :");
        password= scanner.nextLine();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void action() {
		Model customer=DataManager.getCustomerByEmail(email);
        if(customer==null) {
	        System.out.println("invalid ");

        	
        }
        else if(customer.getPassword().equals(customer.getPassword())){
        	success=true;
	        System.out.println("LOGIN SUCCESSFULL !!");
	        CustomerMenu menu=new CustomerMenu("CUSTOMER MENU");
	        menu.displayMenuAndcaptureSelection();
        	
        }else {
	        System.out.println("invalid ");

        }
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void actionAccount() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void captureAccount1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void displayDepoist() {
		// TODO Auto-generated method stub
		
	}

	

}
