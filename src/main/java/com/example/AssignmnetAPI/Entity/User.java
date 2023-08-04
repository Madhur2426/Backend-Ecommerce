package com.example.AssignmnetAPI.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class User {
	// @Id annotation is used to specify the primary key property of the entity. In
	// this case, the username property is marked as the primary key.
	// @Column annotation is used to specify the column name for a particular
	// property. In this case, the username and password properties will be mapped
	// to corresponding columns in the table.
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	@Column
	String username;

	@Column
	String password;

	// These getter and setter methods provide access to the username and password
	// properties of the User entity. They allow getting and setting the values of
	// these properties.
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
