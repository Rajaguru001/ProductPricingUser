package com.chainsys.encapsulation;

public class Parking {

	public static void main(String[] args) {
		Vehicleparking parking=new Vehicleparking();
		
		parking.setCustomerName("123");
		parking.setLocation("Chennai");	
		parking.setVechileModel("CBR");
		
		System.out.println("Customer Name: "+parking.getCustomerName());
		System.out.println("Location is: "+parking.getLocation());
		System.out.println("Vehiclemodel: "+parking.getVechileModel());
		

	}

}
