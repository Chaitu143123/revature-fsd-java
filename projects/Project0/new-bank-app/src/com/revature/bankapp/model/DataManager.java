package com.revature.bankapp.model;

import java.util.ArrayList;
import java.util.List;


public class DataManager {
	
	private static List<Model> customerList=new ArrayList<>();
	static {
		customerList.add(new Model("john","smith","john","123") );
		
	}
	
	public static void addCustomer(Model customer) {
		customerList.add(customer);
		
		
	}
	public static Model getCustomerByEmail(String email) {
		for(Model customer : customerList) {
			if(customer.getEmail().equals(email)) {
				return customer;
			}
		}
		return null;
	}
	

}
