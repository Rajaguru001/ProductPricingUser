package com.chainsys.encapsulation;

public class Theater {
	String name;
	String location;
	String moivename;
	int seatnumber;
	int time;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
	//	String Name = name;
	//	if(name.matches("^[a-zA-Z]+$")) {

		this.name = name;
	//	}
	//	else {
	//		System.out.println("Enter the Name in Alphabets");
	//	}
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
   //		String Location=location;
	//	if(location.matches("^[a-zA-Z]+$")) {
		this.location = location;
	//		}
	//	else {
	//		System.out.println("Enter Location in Alphabets:");
	//	}
	}
		
	public String getMoivename() {
		return moivename;
	}
	public void setMoivename(String moivename) {
	//	String Moivename=moivename;
	//	if(moivename.matches("^[a-zA-Z]+$")) {
		this.moivename = moivename;
	//}
	//	else {
	//		System.out.println("Enter the Moviename in Alphabets");
	//	} 
	}
	public int getSeatnumber() {
		return seatnumber;
	}
	public void setSeatnumber(int seatnumber) {
	//	int Seatnumber=seatnumber;
	//	if(seatnumber>0) {
		this.seatnumber = seatnumber;
	//	}
	//	else {
	//		System.out.println("Enter the Positive value for SEAT NUMBER:");
	//	} 
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
	//	if(time>0) {
		this.time = time;
//		}
	//	else {
	//		System.out.println("Enter the positive value for TIME:");
	//	} 
	}
		@Override
	public String toString() {
		return "Theaterbooking [name=" + name + ", location=" + location + ", moivename=" + moivename + ", seatnumber="
				+ seatnumber + ", time=" + time +"]";
	}


}
