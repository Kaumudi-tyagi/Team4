package com.cg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Person {

	@Id
	@GeneratedValue
	protected int id;
	@Column(name = "username")
	protected String userName;
	@Column(name = "password")
	protected String password;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Person() {
	}

	public Person(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
}