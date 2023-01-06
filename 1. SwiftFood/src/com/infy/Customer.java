package com.infy;

//class Customer {
	
	class Customer {
		private String customerId;
		private String customerName;
		private long contactNumber;
		private String address;
		private static float deliveryCharge; //you can inisialise this 
		
		static {
			deliveryCharge=1.4f;
			
		}
		
		public Customer(String customerId, String customerName, long contactNumber,
				String address, float deliveryCharge) {
			this.customerId = customerId;
			this.customerName = customerName;
			this.contactNumber = contactNumber;
			this.address = address;
			this.deliveryCharge = 1.5f; // or =deliveryCharge;
		}
		public Customer() {
			// TODO Auto-generated constructor stub
		}
		public static float getDeliveryCharge() {
			return deliveryCharge;
		}
		public static void setDeliveryCharge(float deliveryCharge) {
			Customer.deliveryCharge = deliveryCharge;
		}
		public String getCustomerId() {
			return customerId;
		}
		public void setCustomerId(String customerId) {
			this.customerId = customerId;
		}
		public String getCustomerName() {
			return customerName;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public long getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(long contactNumber) {
			this.contactNumber = contactNumber;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public void displayCustomerDetails() {
			System.out.println("Displaying customer details \n***********");
			System.out.println("Customer Id : " + customerId);
			System.out.println("Customer Name : " + customerName);
			System.out.println("Contact Number : " + contactNumber);
			System.out.println("Address : " + address);
			System.out.println();
		}
	/*
	//instance variables
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
	
	
	//method
	public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}
*/
	
}
