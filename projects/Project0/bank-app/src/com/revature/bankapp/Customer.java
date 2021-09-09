package com.revature.bankapp;

public class Customer {
	private int login;
	private int depoist;
	private int withdrawl;
	public Customer(int login, int depoist, int withdrawl) {
		super();
		this.login = login;
		this.depoist = depoist;
		this.withdrawl = withdrawl;
	}
	public int getLogin() {
		return login;
	}
	public void setLogin(int login) {
		this.login = login;
	}
	public int getDepoist() {
		return depoist;
	}
	public void setDepoist(int depoist) {
		this.depoist = depoist;
	}
	public int getWithdrawl() {
		return withdrawl;
	}
	public void setWithdrawl(int withdrawl) {
		this.withdrawl = withdrawl;
	}
	
}



