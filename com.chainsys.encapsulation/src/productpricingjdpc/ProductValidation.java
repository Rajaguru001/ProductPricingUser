package productpricingjdpc;

import java.util.LinkedList;
import java.util.Scanner;

public class ProductValidation {
	public static String name() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter User name:");
		String name = sc.next();
		while (true) {
			if (name.matches("^[a-zA-Z]+$")) {
				return name;
			} else {
				System.out.println("Enter the valid data");
				name = sc.next();
			}
		}
	}

	public static String pwd() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password:");
		String pwd = sc.next();
		while (true) {

			while (true) {
				if (pwd.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!])(?=\\S+$).{8,20}$")) {

					return pwd;

				} else {
					System.out.println("Use_one uppercase-[A-Z]" + "\n" + "use_one lowercase-[a-z]" + "\n"
							+ "Special character-[!@#$%]");
					System.out.println("Enter the Password:");
					pwd = sc.next();

				}

			}
		}
	}
	
	public static String phone() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Phone number:");
		String Phone = sc.next();
		while(true) {
			if (!Phone.matches("[6789]{1}[0-9]{9}")){
				System.out.println("Enter the Positive Interger:");
				Phone = sc.next();
			}
			else {
				return Phone;
			}
		}
		
		

	
	
}
	
}
