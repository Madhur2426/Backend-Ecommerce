package com.example.AssignmnetAPI.Controller;

//These lines import the necessary classes and dependencies required for the LoginUser class.
import java.util.List;
import com.example.AssignmnetAPI.DTO.*;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.AssignmnetAPI.Entity.Mobile;
import com.example.AssignmnetAPI.Entity.User;
import com.example.AssignmnetAPI.Service.MobileInterface;
import com.example.AssignmnetAPI.Service.ServiceInterface;

//These annotations declare the LoginUser class as a REST controller


//enable cross-origin resource sharing (CORS) for requests originating  from the specified URL (http://localhost:4200/). 
//This allows the client application running on http://localhost:4200/ to make requests to this controller.
@RestController
@CrossOrigin(origins="http://localhost:4200/")
public class LoginUser {

	// autowire the dependencies ServiceInterface and MobileInterface using the
	// @Autowired annotation. It enables the injection of instances of these
	// interfaces into the corresponding fields serviceinterface and mobileinterface
	// in the LoginUser class.
	@Autowired
	ServiceInterface serviceinterface;
	@Autowired
	MobileInterface mobileinterface;

	// maps to the POST request /User/login and accepts a JSON request body
	// containing a User object.
	@PostMapping("/User/login")
	public ResponseEntity<String> loginUser(@RequestBody LoginDto logindto) {
		return this.serviceinterface.loginUser(logindto);
	}

	// POST request /User/add and accepts a JSON request body containing a User
	// object.
	@PostMapping("/User/add")
	public ResponseEntity<String> add(@RequestBody RegistrationDTO registerdto) {
		return this.serviceinterface.add(registerdto);
	}

	// This method maps to the POST request /Mobile/add and accepts a JSON request
	// body containing a Mobile object.
	@PostMapping("/Mobile/add")
	public String addMobile(@RequestBody Mobile mobile) {
		this.mobileinterface.addData(mobile);
		return "Successfully added";
	}

	// This method maps to the GET request /Mobile/get. It retrieves a list of all
	// mobile data by calling the getData() method in the
	// mobileinterface and returns the list.
	@GetMapping("/Mobile/get")
	public List<Mobile> getMobile() {
		return this.mobileinterface.getData();
	}
}