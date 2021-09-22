package com.revature.bankapp.model;

import java.util.ArrayList;
import java.util.List;
public class AccountManager{
	private static List<CreateAccout> customerList=new ArrayList<>();
	static {
		customerList.add(new CreateAccout("111","smith","john","123","1000") );
	}
	public static void addCustomer(CreateAccout customer) {
		customerList.add(customer);
		
		
	}
	public static CreateAccout getCustomerByAccount(String accountNumber) {
		for(CreateAccout customer : customerList) {
			if(customer.getAccountNumber().equals(accountNumber)) {
				return customer;
			}
		}
		return null;



}
	}
	

