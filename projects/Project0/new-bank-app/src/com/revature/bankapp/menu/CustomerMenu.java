package com.revature.bankapp.menu;

import java.util.Scanner;

import com.revature.bankapp.form.Depoist;
import com.revature.bankapp.form.ViewAccount;
import com.revature.bankapp.model.AccountManager;
import com.revature.bankapp.model.CreateAccout;

public class CustomerMenu extends Menu
{
   public CustomerMenu(String name) {
		super(name);
		addMenuItems("CREATE ACCOUNT");
		addMenuItems("VIEW ACCOUNT");
		addMenuItems("DEPOIST AMOUNT");
		addMenuItems("WITHDRWAL AMOUNT");
		addMenuItems("EXIT");




	}
	@Override
	void handleAction() {
		
		Scanner scanner = new Scanner(System.in);

		switch(selection) {
		case 1:
			System.out.println("===============");
	        System.out.println("create account");
	        System.out.println("================");

	        System.out.println("Enter account number :");
	        String accountNumber= scanner.nextLine();
	        System.out.println("Enter account holder name :");
	        String accountHolderName= scanner.nextLine();
	        System.out.println("Enter address :");
	        String address= scanner.nextLine();
	        System.out.println("Enter  accountType:");
	        String accountType= scanner.nextLine();
	        System.out.println("Enter  balance:");
	        String balance= scanner.nextLine();
	        CustomerMenu menu=new CustomerMenu("account");
	        menu.displayMenuAndcaptureSelection();


	        break;
		case 2:
			
		    ViewAccount view=new ViewAccount("view account");
            System.out.println("Enter accountNumber:");
			accountNumber= scanner.nextLine();
		    System.out.println("Enter  accountHolderName :");
		    accountHolderName = scanner.nextLine();
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
		        CustomerMenu menu3=new CustomerMenu("view account");
		        menu3.displayMenuAndcaptureSelection();
                }else {
		        System.out.println("invalid account number ");

		}
		    break;
		case 3:
			Depoist depoist=new Depoist("depoist amount");
			int dep=depoist.displayDepoist();
			Depoist.add(dep);
	        CustomerMenu menu1=new CustomerMenu("depoist account");

	        menu1.displayMenuAndcaptureSelection();

			break;
		case 4:
			Depoist.displayWithdraw();
	        CustomerMenu menu2 =new CustomerMenu("withdraw account");
	        menu2 .displayMenuAndcaptureSelection();

			break;
		case 5:
	        System.out.println("Exit successfully");
	        break;
		}

			
		
			

		
	

	
	

		
	}

	
		
	

	
	}




	
	

	


