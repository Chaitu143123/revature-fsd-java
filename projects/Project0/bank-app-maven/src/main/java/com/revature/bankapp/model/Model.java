package com.revature.bankapp.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Model {
	private long id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private static long counter1;
	private static long counter = 0;


	private CreateAccout account;
	private ArrayList<CreateAccout> accountList;
	private static CreateAccout currentAccount;
	
	
	public static CreateAccout getCurrentAccount() {
		return currentAccount;
	}

	public static void setCurrentAccount(CreateAccout currentAccount) {
		Model.currentAccount = currentAccount;
	}



	public Model() {
		super();
		counter1++;
		this.id = counter1;

		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.accountList = accountList;


	}
	
	public Model(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public static long getCounter() {
		return counter1;
	}

	public static void setCounter(long counter) {
		Model.counter1 = counter;
	}
	public static long selectAccount() {
		System.out.print("Select account to perform transaction : ");
		Scanner scanner = new Scanner(System.in);
		long choice = scanner.nextInt();
		return choice;
	}

		
	}
	



		
	

