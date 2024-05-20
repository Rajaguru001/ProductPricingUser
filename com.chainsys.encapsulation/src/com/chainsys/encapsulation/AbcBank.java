package com.chainsys.encapsulation;
import java.util.*;

import java.util.random.*;
import java.util.*;
import java.util.regex.*;

public class AbcBank {
	public static void main(String[] agrs) {

		BankDepositeForm bd = new BankDepositeForm();
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		System.out.print("Enter the Amount: ");
		int amount = sc.nextInt();

		if (amount < 0) {
			System.out.print("Enter the Correct amount: ");
			amount = sc.nextInt();
		}

		bd.setAmount((amount));
		// if(amount>20000) {
		// rd.deposite(bd.getAmount());
		// }
		// else {
		// b.deposite(bd.getAmount());

		// }

		System.out.print(":Enter Account Holder name: ");
		String name = sc.next();
		if (name.matches("^[0-9]+$")) {
			System.out.print("--Enter the Input in Alphabets--: ");
			name = sc.next();

		}
		bd.setName((name));

		System.out.print("Enter Account number: ");

		long accountnumber = sc.nextInt();
		while (true) {
			if (accountnumber > 0) {
				break;
			} else {
				System.out.print("--Enter the value in Positive integer--: ");
				accountnumber = sc.nextInt();
			}
		}
		bd.setAccountnumber((accountnumber));

		System.out.print("Enter the PAN CARD: ");
		String pancard = sc.next();
		if (pancard.matches("^[a-z]+$")) {
			System.out.print("--Enter the Input in Uppercase and integer--: ");
			pancard = sc.next();
		}
		bd.setPancard((pancard));

		System.out.print("Enter the Phone Number:");
		long phonenumber = sc.nextLong();
		while (true) {
			if (phonenumber > 0) {
				break;
			} else {
				System.out.print("--Enter the value in positive Integer for phone number--: ");
				phonenumber = sc.nextLong();
			}
		}
		bd.setPhonenumber((phonenumber));

		System.out.print("Enter the IFSC Number: ");
		String ifsc = sc.next();
		if (ifsc.matches("[a-z0-9]+$")) {

			System.out.print("--Enter the Input in Uppercase-- :");
			ifsc = sc.next();
		}
		bd.setIfsc(ifsc);

		Bankdeposite rd = new Bankdeposite();

		Classb b = new Classb();
		if (amount < 10000) {
			int incentives=5000;
			int balance=10000;
			amount=amount+incentives+balance;
			b.deposite(bd.getAmount());
		}

		Goldloan gd = new Goldloan();

		rd.deposite(bd.getAmount());
		rd.deposite(bd.getName(), bd.getIfsc());
		rd.deposite(bd.getName(), bd.getPancard(), bd.getPhonenumber());
		rd.deposite(bd.getName(), bd.getIfsc(), bd.getPancard(), bd.getPhonenumber(), bd.getAccountnumber());

		gd.deposite(amount);
		

	}

}
