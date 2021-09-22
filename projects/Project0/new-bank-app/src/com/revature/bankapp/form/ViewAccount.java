package com.revature.bankapp.form;

import java.util.Scanner;

import com.revature.bankapp.menu.CustomerMenu;
import com.revature.bankapp.model.AccountManager;
import com.revature.bankapp.model.CreateAccout;
import com.revature.bankapp.model.DataManager;
import com.revature.bankapp.model.Model;

public class ViewAccount extends Form{
	

	private static String success;
	private String accountNumber;
	private String accountHolderName;
    public ViewAccount(String accountNumber) {
		super(accountNumber, accountNumber, accountNumber, accountNumber, success,success,success,success);
	}
    @Override
	public void captureAccount1() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter accountNumber:");
		accountNumber= scanner.nextLine();
        System.out.println("Enter  accountHolderName :");
        accountHolderName = scanner.nextLine();
	}
		
	@Override
	public void actionAccount() {
		CreateAccout customer=AccountManager.getCustomerByAccount(accountNumber);
		if(customer==null) {
	        System.out.println("invalid account number ");

			
		}
	    
		else if(customer.getAccountHolderName().equals(accountHolderName)){
	    	boolean success = true;
	        System.out.println("*****WELCOME TO YOUR ACCOUNT*****");  

	        
	        System.out.println("Account number: " + customer.getAccountNumber());  

	        System.out.println("Name of account holder: " + customer.getAccountHolderName());  
	        System.out.println("Account type: " + customer.getAccountType());  
	        System.out.println("Balance: " +customer.getBalance());  
	        CustomerMenu menu=new CustomerMenu("view account");
	        menu.displayMenuAndcaptureSelection();



			

	    }else {
	        System.out.println("invalid account number ");

	}

	


}
	public void captureData() {
		// TODO Auto-generated method stub
		
	}
	public void action() {
		// TODO Auto-generated method stub
		
	}
	public void accountData() {
		// TODO Auto-generated method stub
		
	}
	
		
	}

