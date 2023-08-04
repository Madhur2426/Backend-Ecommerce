package com.example.AssignmnetAPI.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Mobile {
	@Id
	int id;
	String model;
	int price;

	public Mobile() {
		super();
	}

	String info;
	String picture;
	boolean cartAdded;

	/**
	 * Constructs a new Mobile object with the provided parameters.
	 *
	 * @param id        The ID of the mobile.
	 * @param model     The model of the mobile.
	 * @param price     The price of the mobile.
	 * @param info      Additional information about the mobile.
	 * @param picture   The picture of the mobile.
	 * @param cartAdded A flag indicating whether the mobile has been added to the
	 *                  cart.
	 */
	public Mobile(int id, String model, int price, String info, String picture, boolean cartAdded) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		this.info = info;
		this.picture = picture;
		this.cartAdded = cartAdded;
	}

	@Override
	public String toString() {
		return "Mobile [id=" + id + ", model=" + model + ", price=" + price + ", info=" + info + ", picture=" + picture
				+ ", cartAdded=" + cartAdded + "]";
	}

	public int getId() {
		return id; // returns the value of the id data member
	}

	public void setId(int id) {
		this.id = id; // sets the value of the id data member.
	}

	public String getModel() {
		return model; // returns the value of the model data member.
	}

	public void setModel(String model) {
		this.model = model; // sets the value of the model data member
	}

	public int getPrice() {
		return price; // returns the value of the price data member.
	}

	public void setPrice(int price) {
		this.price = price; // sets the value of the price data member
	}

	public String getInfo() {
		return info; // returns the value of the info data member.
	}

	public void setInfo(String info) {
		this.info = info; // sets the value of the info data member.
	}

	public String getPicture() {
		return picture; // returns the value of the picture data member.
	}

	public void setPicture(String picture) {
		this.picture = picture; // sets the value of the picture data member
	}

	public boolean isCartAdded() {
		return cartAdded; // returns the value of the cartAdded data member
	}

	public void setCartAdded(boolean cartAdded) {
		this.cartAdded = cartAdded; // sets the value of the cartAdded data member.
	}

}
