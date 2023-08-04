package com.example.AssignmnetAPI.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
public class LoginDto {
	@Id
	@Column
	String username;

	@Column
	String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public LoginDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LoginDto [username=" + username + ", password=" + password + "]";
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
