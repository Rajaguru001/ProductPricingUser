package com.chainsys.encapsulation;
import java.util.*;

public class Ticketbooking {

	public static void main(String[] args) {
	  Theater bt=new Theater();
	  Scanner sc= new Scanner (System.in);
	  Theaterbooking1 ttb=new Theaterbooking1();
	  ttb.rules();
	  
	  System.out.println("Enter The Name: ");
	  String name=sc.next();
	while(true) { 
	  if(name.matches("^[a-zA-Z]+$")) {
		  bt.setName(name);
		  break;
	  }
	  else {
		  System.out.println("Enter the Valid Data (A-Z):");
		  name=sc.next();
	  }
	
	}
	  
	  System.out.println("Enter The Location :");
	  String location=sc.next();
	  while(true) {
	  if(location.matches("^[a-zA-Z]+$")) {
		  bt.setLocation(location);
		  break;
	  }
	  else {
		  System.out.println("Enter the Valid Data (A-Z):");
		  location=sc.next();
	  }
	 }
	  
	  System.out.println("Enter The Movie Name:");
	  String moviename=sc.next();
	  while(true) {
	  if(moviename.matches("^[a-zA-Z]+$")) {
		  bt.setMoivename(moviename);
		  break;
	  }
	  else {
		  System.out.println("Enter the Valid Data (A-Z): ");
		  moviename=sc.next();
	  }
	  }
	  
	  System.out.println("Enter The Movie Time: ");
	  int time=sc.nextInt();
	 while(true) {
	  if(time>0) {
		  bt.setTime(time);
		  break;
	  }
	  else {
		  System.out.println("Enter The Value in Positive Integer: ");
		  time=sc.nextInt();
	  }
	 }
	  
	  System.out.println("Enter the seat number: ");
	  int seatnumber=sc.nextInt();
	  while(true) {
	  if(seatnumber>0) {
		  bt.setSeatnumber(seatnumber);
		  break;
	  }
	  else {
		  System.out.println("Enter The Value in Positive Integer: ");
		  seatnumber=sc.nextInt();
	  }
	  }
	  
	
	  ttb.username(bt.getName());
	  ttb.moviename(bt.getMoivename());
	  ttb.location(bt.getLocation());
	  ttb.seatnumber(bt.getSeatnumber());
	  ttb.time(bt.getTime());
	  
	  
	  
	 
	}

}
