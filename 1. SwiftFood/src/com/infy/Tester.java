package com.infy;

class Tester {
	
	public static void main(String args[]) {
		// Object creation of the customer class
	/*	Customer customer = new Customer();
		// Assigning values to the instance variables
		customer.customerId = "C101";
		customer.customerName = "Stephen Abram";
		customer.contactNumber = 7856341287L;
		customer.address = "D089, St. Louis Street, Springfield, 62729";
		
		//Calling display method in the customer class
		customer.displayCustomerDetails();
		*/
		//Object creation of order class
		Order order = new Order();
		
		//Assigning the variables
		order.orderId = 101;
		order.orderedFood = "Pasta";
		order.totalPrice = 100;
		order.status = "Ready for collection...";
		
		//Calling of the calculate method in the order class
		order.calculateTotalPrice(100);
		
		//Object
		Restaurant restaurant = new Restaurant();
		
		//Assign 
		restaurant.restaurantName = "GDK";
		restaurant.rating = (float) 4.5;
		//restaurant.resturantContact = 495936592;
		restaurant.resturantAddress = "FPK, London";
		
		//Call method
		restaurant.displayRestaurantDetails();
		
		//Constructor and this keyword - Assignment 1
		
		//Object creation
		Order order1 = new Order();
		
		//Object creation2
		Order order2 = new Order(101, "Pizza");
		
		//Constructor and this keyword - Assignment 2
		
		//Create Object
		//Restaurant restaurant2 = new Restaurant("Kenza Food", 778985, "N5 1AZ", 5); //doesnt work cuz long is now long[]
		//restaurant2.displayRestaurantDetails();
		
		//Setting to null means the object is eligible for garbage collection.
		order2 = null;
		
		//When the reference variable is initialised to a new object and there is no reference to the previous object
		Order order3 = new Order(101, "Pizza");
		order3 = new Order(102, "Rice Pudding");
		
		//When a reference variable is local to some method, it will be removed from the stack as soon as the method 
		//finishes execution. The object pointed by the reference variable then becomes eligible for garbage collection.
		
		//array for contacte
		
		long[] restaurantContacts = { 9992346725L, 9992346726L, 9992346727L };
		Restaurant restaurant1 = new Restaurant("SwiftFood", restaurantContacts, "Carolina Street, Springfield, 62702", 4.1f);
		restaurant1.displayRestaurantDetails();
		
		//acsessing staic variables from class
		System.out.println(Customer.getDeliveryCharge());
	
		
		
		
	}
}
