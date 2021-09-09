package com.revature.bankapp.form;

import java.util.Scanner;

import com.revature.bankapp.menu.CustomerMenu;
import com.revature.bankapp.model.DataManager;
import com.revature.bankapp.model.Model;

public class LoginForm extends Form{
	private String email;
	private String password;
	
	

	

	public LoginForm(String name, boolean success) {
		super(name, success);
		// TODO Auto-generated constructor stub
	}

	@Override
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
	        System.out.println("login successful :");
	        CustomerMenu menu=new CustomerMenu("CUSTOMER MENU");
	        menu.displayMenuAndcaptureSelection();
	        
	        
	        System.out.println("wellcome :" + customer.getFirstname());

        	
        }else {
	        System.out.println("invalid ");

        }
		// TODO Auto-generated method stub
		
	}

}
