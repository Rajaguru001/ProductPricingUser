package com.chainsys.encapsulation;

import java.util.*;
import java.util.regex.*;

public class Bankdeposite {

	Scanner sc = new Scanner(System.in);

	public void deposite(int amount) {
		int balance = 10000;

		balance = amount + balance;
	//	System.out.println("The Balance in your Account is: " + balance);

	}

	public void deposite(String name, String ifsc) {
		if (name.matches("^[a-zA-Z]+$") && ifsc.matches("^[a-zA-Z0-9]+$")) {
			System.out.println("Account Holder name:" + name + "  IfSC Number:" + ifsc);

		} else {
			System.out.println("Enter the value in Alphabets");
			System.out.println("enter the correct name: ");
			name = sc.next();
			System.out.println("Enter the corret pancard number: ");
			ifsc = sc.next();

		}

	}

	public void deposite(String name, String pancard, long phonenumber) {
		if (name.matches("^[a-zA-Z0-9]+$") && pancard.matches("^[A-Z0-9]+$")) {
			System.out.println(
					"Account Holder name :" + name + "  PancardNumber" + pancard + "  Phone Number" + phonenumber);
		} else {
			System.out.println("enter the correct name: ");
			name = sc.next();
			System.out.println("Enter the corret pancard number: ");
			pancard = sc.next();

		}

	}

	public void deposite(String name, String ifsc, String pancard, long phonenumber, long accountnumber) {
		if (name.matches("^[a-zA-Z0-9]+$") && ifsc.matches("^[A-Z0-9]+$") && pancard.matches("^[A-Z0-9]+$")) {
			System.out.println("Account Holder name :" + name + "  IfSC Number:" + ifsc + "  PancardNumber: " + pancard
					+ "  PhoneNumber: " + phonenumber + "  Account Number : " + accountnumber);
		} else {
			System.out.println("Enter the correct Value: ");
		}

	}

}