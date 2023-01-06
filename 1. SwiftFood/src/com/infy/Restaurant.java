package com.infy;

public class Restaurant {
	String restaurantName;
	long[] resturantContact;
	String resturantAddress;
	float rating;
	
	public void displayRestaurantDetails() {
		System.out.println("---RESTAURANT DETAILS---");
		System.out.println("Restaurant Name: " + restaurantName);
		System.out.println("Resturant Contact: " + resturantContact);
		System.out.println("Resturant Address: " + resturantAddress);
		System.out.println("Rating: " + rating);
	}
	
	//Method parameterless
	public Restaurant() {
		
	}
	
	//Method                       array
	public Restaurant(String name, long[] restaurantContacts, String restaurantAddress, float rating) {
		this.restaurantName = name;
		this.resturantContact = restaurantContacts;
		this.resturantAddress = restaurantAddress;
		this.rating = rating;
	}

}
