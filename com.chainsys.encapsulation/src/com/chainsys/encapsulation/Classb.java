package com.chainsys.encapsulation;

public class Classb extends Bankdeposite {
	public void deposite(int amount) {
		
		int balance = 10000;
		int incentives=5000;

		balance = amount + balance+incentives;
	//	System.out.println("The Balance in your Account is: " + balance);

	
		
		System.out.println("-------For Rural Area Scheme-----");
		System.out.println("---GOVT Provide 5000 incentives for this scheme---");
	//	int incentives=5000;
	//	int balance=10000;

	//	balance= amount + balance+ incentives;
		
		System.out.println("The Balance in your Account is: " + balance);

	}
	}




