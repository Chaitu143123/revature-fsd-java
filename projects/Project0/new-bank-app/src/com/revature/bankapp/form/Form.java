package com.revature.bankapp.form;

import java.util.Scanner;

public abstract class Form {
	protected String name;
	protected String accountHolderName;
	protected String accountType;
	protected String balance;

	
	protected boolean success;
	
	public Form(String name, String accountHolderName, String accountType, String balance, boolean success) {
		super();
		this.name = name;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.balance = balance;
		this.success = success;
	}

	
	public Form(String name2, String name3, String name4, String name5, Object success2, Object success3,
			Object success4, Object success5) {
		// TODO Auto-generated constructor stub
	}


	private void displayTitle() {
		System.out.println("\n=====");
		System.out.println("LOGIN");
		System.out.println("=====\n");
	}
		
	
	
	public void captureDataAndPerformAction() {
		while (!success) {
			displayTitle();
			captureData();
			action();
		}
		
	}
	protected abstract void action();


	protected abstract void captureData();
	


	public void accountData() {
		while (!success) {
			captureAccount1();
			actionAccount();
		}			
			

	}


	protected abstract void actionAccount();


	protected abstract void captureAccount1();


	protected void displayDepoist() {
		
	}
		
			
		

		
	


	



}

