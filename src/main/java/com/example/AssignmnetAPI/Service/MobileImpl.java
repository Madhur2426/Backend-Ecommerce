package com.example.AssignmnetAPI.Service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.AssignmnetAPI.Dao.daoMobile;
import com.example.AssignmnetAPI.Entity.Mobile;

@Service
public class MobileImpl implements MobileInterface {
	public final Logger log = LogManager.getLogger(ServiceImpl.class);
	// autowires the daoMobile dependency, indicating that an instance of daoMobile
	// will be injected into the mobile field.
	@Autowired
	daoMobile mobile;

	// saves a new Mobile object to the data store by calling the save() method on
	// the mobile object. It also logs an information
	// message indicating that the mobile data was successfully added.
	@Override
	public void addData(Mobile mobile) {
		this.mobile.save(mobile);
		log.info("Mobile Data Added");
	}

	// retrieves a list of all mobile data from the data store by calling the
	// findAll() method on the mobile object. It logs an information
	// message indicating that all the mobile data is being returned and then
	// returns the list of mobile data.
	@Override
	public List<Mobile> getData() {
		log.info("returning all the data of Mobile");
		return this.mobile.findAll();
	}

}
