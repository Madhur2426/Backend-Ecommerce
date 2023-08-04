package com.example.AssignmnetAPI.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.example.AssignmnetAPI.DTO.LoginDto;
import com.example.AssignmnetAPI.DTO.RegistrationDTO;
import com.example.AssignmnetAPI.Entity.User;

public interface ServiceInterface {
	public ResponseEntity<String> add(RegistrationDTO registerdto);// used to add a new User object
	//public RegistrationDTO createUser(RegistrationDTO registerdto);
	public ResponseEntity<String> loginUser(LoginDto logindto);// used to authenticate a user's login credentials.
	//public ResponseEntity<String> add(User user);// used to add a new User object

	public List<User> getAllUsers();// retrieve a list of all users
}
