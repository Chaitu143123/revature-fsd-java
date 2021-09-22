package com.revature.bankapp.model;

public class CreateAccout{
	private long id;

	private String accountNumber;
	private String accountHolderName;
	private String accountType;
	private String balance;
	private static long counter;

	public CreateAccout(String accountNumber, String accountHolderName, String address, String accountType,
			String balance) {
		super();
		counter++;
		this.id=counter;
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.balance = balance;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
		public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public static long getCounter() {
		return counter;
	}

	public static void setCounter(long counter) {
		CreateAccout.counter = counter;
	}
	

}
