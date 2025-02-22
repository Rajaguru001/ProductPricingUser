package com.chainsys.encapsulation;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductDetails {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ProductInfo pi = new ProductInfo();
		User u = new User();
		ProductSpecs ps = new ProductSpecs();
		ProductPricing gps = new ProductPricing("gps", 60000, 10, 4, 4);
		ProductPricing gaming = new ProductPricing("Gaming", 70000, 10, 4, 4);
		ProductPricing theater = new ProductPricing("Theater", 50000, 10, 4, 4);
		ProductValidation pv = new ProductValidation();
		ProductExeAbs Productabs = new ProductExeAbs();
		LinkedList<String> li = new LinkedList<String>();
		

		Productabs.welcome();
		li.add("Raja");
		li.add("guru");
		li.add("Nagaraj");
		li.add("Vasa");
		li.add("raj");

		int total = 0;

		System.out.println("Do you have a account (y/n):");
		String acc = sc.next();

		while (true) {
			if (acc.equals("y") || acc.equals("Y")) {
				System.out.println("Great! you have a account");
				System.out.println("-------LOGIN PAGE--------");
				String username = ProductValidation.name();
				u.setUsername(username);
				while (true) {
					if (li.contains(username)) {
						System.out.println();
						break;
					} else {

						System.out.println("Account Not Found");
						System.out.println("Please Sign Up");
						System.out.println("SIGNUP PAGE");

						String firstname = ProductValidation.name();
						u.setUsername(firstname);

						System.out.println("Last Name:");
						String lastname = sc.next();

						String pwd = ProductValidation.pwd();
						u.setPassword(pwd);

						double phonenumber = ProductValidation.phone();
						u.setPhonenumber(phonenumber);

						u.getFirstname();
						System.out.println("phone number:" + u.getPhonenumber());
					}
				}

				String pwd = ProductValidation.pwd();
				u.setPassword(pwd);

			}

			while (true) {
				if (acc.equals("n") || acc.equals("N")) {
					System.out.println("SIGNUP PAGE");

					String firstname = ProductValidation.name();
					u.setUsername(firstname);

					System.out.println("Last Name:");
					String lastname = sc.next();

					String pwd = ProductValidation.pwd();
					u.setPassword(pwd);

					double phonenumber = ProductValidation.phone();
					u.setPhonenumber(phonenumber);

					u.getFirstname();
					System.out.println("phone number:" + u.getPhonenumber());
				}

				System.out.println("Your user Name :" + u.getUsername());

				System.out.println("       The Products Are        ");
				System.out.println("-------------------------------");
				System.out.println(
						"-->1) gps console" + "\n" + "-->2) gaming console" + "\n" + "-->3) smart home theater");
				System.out.println("-------------------------------");
				System.out.println("Please choose the Number 1,2,3");
				System.out.println("-------------------------------");
				boolean b = true;
				while (b) {
					String nameofproduct = sc.next();
					switch (nameofproduct.toLowerCase()) {
					case "1":

						System.out.println("product: " + gps.getNameofproduct());
						gps.display();
						System.out.println("------------------------------------");
						System.out.println("do you want to purchase your product(yes/no)? ");
						String s = sc.next();
						if (s.equals("yes")) {
							System.out.println("Thank you for purchasing our product:" + gps.getCostofproduct());
							gps.setNoofwarranty(ProductSpecs.productwarranty(gps.noofwarranty));

							System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");

							System.out.println("Warrenty : " + gps.getNoofwarranty());

							System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
							System.out.println("|Our Other Maps products|");
							System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
						} else {
							System.out.println("Thanks for visit our product");
						}
						total += ps.amazonwarrentyy(total);
						total += gps.getCostofproduct();
						System.out.println(" Total purchase value is" + total);

						b = false;
						return;
					case "2":

						System.out.println("product:" + gaming.getNameofproduct());
						gaming.display();

						System.out.println("Do you want to purchase our product (yes/no): ");
						String gc = sc.next();
						if (gc.equals("yes")) {
							System.out.println("Thank you for purchasing our product:" + gaming.getCostofproduct());
							System.out.println("------------------------------------");
							gaming.setNoofwarranty(ProductSpecs.productwarranty(gaming.noofwarranty));
							System.out.println("Warranty :" + gaming.getNoofwarranty());

							System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
							System.out.println("||Our Other gaming setup  products||");
							System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");

						} else {
							System.out.println("Thanks for visit our product");
						}

						total += ps.flipkartwarrentyy(total);
						total += gaming.getCostofproduct();
						System.out.println(" Total purchase value is" + total);
						b = false;
						return;
					case "3":

						System.out.println("product: " + theater.getCostofproduct());
						theater.display();
						System.out.println("Do you want to purchase our product(yes/No): ");
						String hmt = sc.next();
						if (hmt.equals("yes")) {
							System.out.println("------------------------------------");
							System.out.println("Thank you for purchasing our product:" + theater.getCostofproduct());
							theater.setNoofwarranty(ProductSpecs.productwarranty(theater.noofwarranty));
							System.out.println("Warranty: " + theater.getNoofwarranty());
							System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
							System.out.println("||Our Other gaming setup products||");
							System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~");

						} else {
							System.out.println("Thanks for visit our product");
						}
						total += ProductSpecs.ajiowarrenty(total);
						total += theater.getCostofproduct();
						System.out.println("Total purchase value is " + total);
						b = false;
						return;
					default:
						System.out.println("ENter valid data:");
						nameofproduct = sc.next();

						Productabs.Productrules();
						Productabs.thanks();

					}

				}

			}
		}
	}
}
