package com.example.AssignmnetAPI.Service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.AssignmnetAPI.DTO.LoginDto;
import com.example.AssignmnetAPI.DTO.RegistrationDTO;
import com.example.AssignmnetAPI.Dao.Dao;
import com.example.AssignmnetAPI.Entity.User;

@Service
public class ServiceImpl implements ServiceInterface {
//Creating a logger instance for logging service-related information and messages	
	public final Logger log = LogManager.getLogger(ServiceImpl.class);
	@Autowired
	Dao user;
@Autowired
ModelMapper modelMapper;
	public List<User> getAllUsers() {
		return user.findAll();// returning list of all Users
	}

	
//	public ResponseEntity<String> add(User user) {
//		this.user.save(user);// Saving user data in database
//		log.info("Registration Successfull");
//		return ResponseEntity.status(HttpStatus.OK).body("Registered");
//	}
//	public RegistrationDTO createUser(RegistrationDTO registerdto) {
//		User user=this.dtoToUser(registerdto);
//		System.out.println("Converted to User");
//		User savedUser=this.user.save(user);
//		System.out.println("Saved to DB");
//		return this.userToDto(savedUser);
//	}
	public User dtoToUser(RegistrationDTO registerdto) {
		User user=this.modelMapper.map(registerdto,User.class);
		return user;
	}
	public RegistrationDTO userToDto(User user) {
		RegistrationDTO regitsrationdto=this.modelMapper.map(user,RegistrationDTO.class);
		return regitsrationdto;
	}
	public ResponseEntity<String> add(RegistrationDTO registerdto){
		 try {
			 User user=this.dtoToUser(registerdto);
				User savedUser=this.user.save(user);
		        if (savedUser != null) {
		            return ResponseEntity.status(HttpStatus.OK).body("User Registered Successfully");
		        }
		    } catch (Exception e) {
		        // Handle the exception and provide an appropriate error response
		        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error Registering User: " + e.getMessage());
		    }

		    return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error Registering User");
	}

	@Override
	/*
	 * It saves a new user to the data store by calling the save() method on the
	 * user object. It also logs an information message indicating that the
	 * registration was successful.
	 * 
	 * @param username The username entered by the user.
	 * 
	 * @param password The password entered by the user.
	 */
	public ResponseEntity<String> loginUser(LoginDto logindto) {
		List<User> users = getAllUsers();
		 User user=this.dtoToLogin(logindto);
		for (User data : users) {
			if (user.getUsername().equals(data.getUsername()) && user.getPassword().equals(data.getPassword())) {
				log.info("Credentails are correct");
				log.info("Login Successfull");
				return ResponseEntity.status(HttpStatus.OK).body("Login Successfull");
			}
		}
		// the credentials are wrong and returns false.
		log.info("Credentials are Wrong");
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("INTERNAL_SERVER_ERROR");
	}
	public User dtoToLogin(LoginDto logindto) {
		User user=this.modelMapper.map(logindto,User.class);
		return user;
	}
}
