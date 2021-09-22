package com.revature.bankapp.menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.revature.bankapp.model.AccountManager;
import com.revature.bankapp.model.CreateAccout;

public abstract class Menu {
	protected String name;
	protected List<String> menuItems;
	protected int selection;
	public Menu(String name) {
		this.name = name;
		menuItems = new ArrayList<>();
	}
	public void addMenuItems(String menuItemName) {
		menuItems.add(menuItemName);
	}
	public void displayMenu() {
		System.out.println("=====");
		System.out.println("MENU");
		System.out.println("=====");
		for(int i = 0;i< menuItems.size();i++) {
			System.out.println((i+1) + ")" +menuItems.get(i));

			
		}
		System.out.println("choose option :");



	}
	public void captureSelection() {
		Scanner sc=new Scanner(System.in);
	    selection =Integer.parseInt(sc.nextLine());
	}
	public void displayMenuAndcaptureSelection() {
		displayMenu();
		captureSelection();
	    handleAction();
	    

		
		
	}
	
		
		
		


	
	abstract void handleAction(); 
		
	
}
