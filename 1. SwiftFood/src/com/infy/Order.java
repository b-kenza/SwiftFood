package com.infy;

public class Order {
	
	//Instance Variables
	int orderId;
	String orderedFood;
	double totalPrice;
	String status;
	
	//Method
	public void calculateTotalPrice(int unitPrice) {
		totalPrice = unitPrice+(unitPrice*5)/100;
		//return totalPrice;
		System.out.println("---ORDER DETAILS---");
		System.out.println("Order Id: " + orderId);
		System.out.println("Ordered Food " + orderedFood);
		System.out.println("Order Status: " + status);
		System.out.println("Total Price: £" + totalPrice);
	}
	
	//Constructor
	public Order() {
		this.status = "Ordered";
		System.out.println("Status: "+status);
	}
	
	//Constructor
	public Order(int orderId, String orderedFoods) {
		this.orderId = orderId;
		this.orderedFood = orderedFoods;
		System.out.println("Order Id: "+orderId+" Odered Food: "+orderedFoods);
	}



}
