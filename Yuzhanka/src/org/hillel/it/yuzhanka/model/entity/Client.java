package org.hillel.it.yuzhanka.model.entity;

public class Client {
	String firstName;
	String lastName;
	String email;
	Reservation reserve;
	int uin;

	public Client(String firstName, String lastName, String email, int uin) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.uin = uin;
	}

}
