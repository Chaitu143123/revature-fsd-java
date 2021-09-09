package com.revature.bankapp.form;

public abstract class Form {
	protected String name;
	protected boolean success;
	public Form(String name, boolean success) {
		super();
		this.name = name;
		this.success = success;
	}
	private void displayTitle() {
		System.out.println("\n====");
		System.out.println(name);
		System.out.println("====\n");
	}
	public void captureDataAndPerformAction() {
		while (!success) {
			displayTitle();
			captureData();
			action();
		}
	}
	
	public abstract void captureData();
	
	public abstract void action();



}
