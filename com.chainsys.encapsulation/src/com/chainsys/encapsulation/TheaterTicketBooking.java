package com.chainsys.encapsulation;

public  abstract class  TheaterTicketBooking {
	
	public String username( String name) {
		
		System.out.println("User Name: "+name);
		
		return name;
	}
	public String location(String location) {
		
		System.out.println("Location: "+location);
		
		return location;
	}
	public String moviename( String moviename) {
		System.out.println("The movie is: "+moviename);
		
		return moviename;
	}
	
	public abstract int seatnumber(int seatNo);
	
	public abstract int time(int time);
	
	

} 
