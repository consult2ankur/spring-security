package com.tcs.Springsecurity.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author 1735548
 *
 */
@Entity
public class person {
	@Id
	private int id;
	private String username;
	private String pass;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public person(int id, String username, String pass) {
		super();
		this.id = id;
		this.username = username;
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "person [id=" + id + ", username=" + username + ", pass=" + pass + "]";
	}

	public person() {
		super();
		// TODO Auto-generated constructor stub
	}

}
