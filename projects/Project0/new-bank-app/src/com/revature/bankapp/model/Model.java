package com.revature.bankapp.model;

public class Model {
	private long id;
	private String firstname;
	private String lastname;
	private String email;
	private String password;
	private static long counter;

	public Model(String firstname, String lastname, String email, String password) {
		super();
		counter++;
		this.id = counter;

		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
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
		return counter;
	}

	public static void setCounter(long counter) {
		Model.counter = counter;
	}
}
