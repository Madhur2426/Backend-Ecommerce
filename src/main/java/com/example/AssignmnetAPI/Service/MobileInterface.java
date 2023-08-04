package com.example.AssignmnetAPI.Service;

import java.util.List;

import com.example.AssignmnetAPI.Entity.Mobile;

public interface MobileInterface {
	public void addData(Mobile mobile);// used to add a new Mobile object to the data source

	/*
	 * retrieve a list of all mobile data from the data source. It returns a
	 * List<Mobile> containing all the mobile objects stored in the system or data
	 * store.
	 */
	public List<Mobile> getData();
}
