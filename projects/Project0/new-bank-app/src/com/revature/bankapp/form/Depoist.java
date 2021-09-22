package com.revature.bankapp.form;

import java.util.Scanner;

public class Depoist{
	private int depoistAmount = 0;
	static int balance=1000;
	private static int with;

		public Depoist(String string) {
		// TODO Auto-generated constructor stub
	}
		public int displayDepoist()
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the amount to be depoisted:");
		depoistAmount= scanner.nextInt();
	if(depoistAmount<=0)
	{
		System.out.println("invalid  amount to be depoisted:");

	}else {
		return depoistAmount;
	}
	return depoistAmount;
	}
	public int getBalance() {
		return balance;
	}
	public static void add(int depoistAmount) {
		balance=balance+depoistAmount;
		System.out.println(" Amount depoisted:");
		System.out.println(" ");
		System.out.println("balance :" + balance);
    }
	public static void displayWithdraw()
	{
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter  withdrawl amount:");
        int with=scanner.nextInt();
		if(balance < with) {
	        System.out.println("invalid transacation:");

			
		}else{
            balance = (balance -with );

            System.out.println("Please Collect your " + with +" Rupees");
            System.out.println(" ");
            System.out.println("Total Balance: " +balance);
            System.out.println(" ");
        }
	  		}
		
		
	}


	


