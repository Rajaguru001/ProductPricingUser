package com.chainsys.encapsulation;

public  class Theaterbooking1 extends TheaterTicketBooking implements Theaterrules{
	@Override
	public int seatnumber(int seatNo) {
		System.out.println("Your seatnumber is "+seatNo);
		
		return 0;
	}
	@Override
	public int time(int time) {
		System.out.println("Your ShowTime is "+time);
		return 0;
	}
	public void rules() {
		System.out.println("*************Rules and Reguation***********");
		System.out.println("1)NO smoking and tobacco Allowed in Theater");
		System.out.println("2)NO liquior is Allowed in Theater");
		System.out.println("3)DON'T Litter inside The Theater");
		System.out.println("****************THANK YOU*******************");
	}
	
	}


